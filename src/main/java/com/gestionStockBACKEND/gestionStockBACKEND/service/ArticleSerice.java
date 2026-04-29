package com.gestionStockBACKEND.gestionStockBACKEND.service;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.ArticleDto;

import java.util.List;

public interface ArticleSerice {
    ArticleDto save(ArticleDto articleDto);
    ArticleDto findById(Long id);
    List<ArticleDto> findAll();
    void delete(Long id);
}
