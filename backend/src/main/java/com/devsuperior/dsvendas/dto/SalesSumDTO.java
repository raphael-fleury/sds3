package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class SalesSumDTO implements Serializable {
    
    private SellerDTO seller;
    private Double sum;

    public SalesSumDTO(Seller seller, Double sum) {
        this.seller = new SellerDTO(seller);
        this.sum = sum;
    }
}
