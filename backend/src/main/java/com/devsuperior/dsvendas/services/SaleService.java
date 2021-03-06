package com.devsuperior.dsvendas.services;


import java.util.List;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SalesSuccessDTO;
import com.devsuperior.dsvendas.dto.SalesSumDTO;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {
    
    @Autowired private SaleRepository repository;
    @Autowired private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        var page = repository.findAll(pageable);
        return page.map(SaleDTO::new);
    }

    public List<SalesSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    public List<SalesSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
