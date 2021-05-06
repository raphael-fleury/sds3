package com.devsuperior.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    
    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
        var list = repository.findAll();
        return list.stream().map(e -> new SellerDTO(e)).collect(Collectors.toList());
    }
}
