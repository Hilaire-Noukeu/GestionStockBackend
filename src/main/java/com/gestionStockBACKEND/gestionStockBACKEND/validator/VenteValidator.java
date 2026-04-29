package com.gestionStockBACKEND.gestionStockBACKEND.validator;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.VenteDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VenteValidator {
    public static List<String> validate(VenteDto venteDto){
        List<String> errors=new ArrayList<>();
        if (venteDto==null){
            errors.add("les champs de la vente sont vides");
            return errors;
        }
        if (venteDto.getQuantiteTotale()==null){
            errors.add("la quantite de la vente n'est pas renseignee");
            return errors;
        }
        if (venteDto.getLineVentes()==null){
            errors.add("les lignes de vente de la vente n'existe pas");
            return errors;
        }
        if (venteDto.getUser()==null){
            errors.add("l'utilisateur de la vente n'existe pas");
            return errors;
        }
        return errors;

    }
}
