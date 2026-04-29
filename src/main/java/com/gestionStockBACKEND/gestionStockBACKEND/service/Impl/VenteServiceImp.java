package com.gestionStockBACKEND.gestionStockBACKEND.service.Impl;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.VenteDto;
import com.gestionStockBACKEND.gestionStockBACKEND.entity.Users;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.EntityNotFoundException;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.ErrorCodes;
import com.gestionStockBACKEND.gestionStockBACKEND.exception.InvalidEntityException;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.ArticleRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.LigneVenteRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.UserRpository;
import com.gestionStockBACKEND.gestionStockBACKEND.repository.VenteRepository;
import com.gestionStockBACKEND.gestionStockBACKEND.service.VenteService;
import com.gestionStockBACKEND.gestionStockBACKEND.validator.VenteValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenteServiceImp implements VenteService {

    private VenteRepository venteRepository;
    private LigneVenteRepository ligneVenteRepository;
    private ArticleRepository articleRepository;
    private UserRpository userRpository;


    @Autowired
    public VenteServiceImp(VenteRepository venteRepository,LigneVenteRepository ligneVenteRepository, ArticleRepository articleRepository, UserRpository userRpository){
        this.venteRepository=venteRepository;
        this.ligneVenteRepository=ligneVenteRepository;
        this.articleRepository=articleRepository;
        this.userRpository=userRpository;
    }
    @Override
    public VenteDto save(VenteDto venteDto) {
        List<String> errors = VenteValidator.validate(venteDto);
        if (!errors.isEmpty()){
            throw new InvalidEntityException("vente invalide", ErrorCodes.VENTE_NOT_VALID,errors);
        }
        //validation de l'utilisateur
        Optional<Users> user=userRpository.findById(venteDto.getUser().getId());
        if (user.isEmpty()){
            throw new EntityNotFoundException("utilisateur n'existe pas",ErrorCodes.UTILISATEUR_NOT_FOUND);
        }

    }

    @Override
    public VenteDto findById(Long id) {
        return null;
    }

    @Override
    public List<VenteDto> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}
