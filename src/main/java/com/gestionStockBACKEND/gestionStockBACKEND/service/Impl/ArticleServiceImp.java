package com.gestionStockBACKEND.gestionStockBACKEND.service.Impl;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.ArticleDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Article;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Category;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.EntityNotFoundException;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.ErrorCodes;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.InvalidEntityException;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.InvalidOperationException;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.ArticleRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.CategoryRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.LigneVenteRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.service.ArticleSerice;
import com.gestionStockBACKEND.gestionStockBACKEND.validator.ArticleValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleSerice {

    private ArticleRepository articleRepository;
    private LigneVenteRepository lineVenteRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public ArticleServiceImp(ArticleRepository articleRepository, LigneVenteRepository lineVenteRepository, CategoryRepository categoryRepository){
        this.articleRepository=articleRepository;
        this.lineVenteRepository=lineVenteRepository;
        this.categoryRepository=categoryRepository;
    }
    @Override
    public ArticleDto save(ArticleDto articleDto) {
        List<String> errors= ArticleValidator.validate(articleDto);
        if (!errors.isEmpty()){
            throw new InvalidEntityException("Article invalide", ErrorCodes.ARTICLE_NOT_VALID,errors);
        }
        Category category=categoryRepository
                .findById(articleDto.getCategory().getId())
                .orElseThrow(()-> new EntityNotFoundException("La categorie selectionnee n'existe pas",ErrorCodes.CATEGORY_NOT_FOUND));

        return ArticleDto
                .fromEntity(articleRepository
                .save(ArticleDto.toEntity(articleDto)));

    }

    @Override
    public ArticleDto findById(Long id) {
        if (id==null){
            throw new EntityNotFoundException("Article n'existe pas",ErrorCodes.ARTICLE_NOT_FOUND);
        }
        Optional<Article> article=articleRepository.findById(id);
        return Optional.of(ArticleDto.fromEntity(article.get()))
                .orElseThrow(()-> new EntityNotFoundException("Aucun article avec l'ID"+id+"n'existe pas",ErrorCodes.ARTICLE_NOT_FOUND));
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll()
                .stream()
                .map(ArticleDto::fromEntity)
                .toList();
    }

    @Override
    public void delete(Long id) {

        if (id==null){
            throw new EntityNotFoundException("article n'existe pas",ErrorCodes.ARTICLE_NOT_FOUND);
        }
        // Vérifie si l'article est utilisé dans une ligne de vente
        Boolean existInVente=lineVenteRepository.existsByArticleId(id);
        if (existInVente){
            throw new InvalidOperationException("l'article est deja dans une vente");
        }
        articleRepository.deleteById(id);

    }
}
