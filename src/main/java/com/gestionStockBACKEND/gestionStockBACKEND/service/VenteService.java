package com.gestionStockBACKEND.gestionStockBACKEND.service;

import com.gestionStockBACKEND.gestionStockBACKEND.dto.VenteDto;

import java.util.List;

public interface VenteService {
    VenteDto save(VenteDto venteDto);
    VenteDto findById(Long id);
    List<VenteDto> findAll();
    void delete(Long id);
}
