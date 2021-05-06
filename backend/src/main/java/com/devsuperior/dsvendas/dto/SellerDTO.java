package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class SellerDTO implements Serializable {
    
    private Long id;
    private String name;

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
