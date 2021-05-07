package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class SalesSuccessDTO implements Serializable {
    
    private SellerDTO seller;
    private Long visited;
    private Long deals;

    public SalesSuccessDTO(Seller seller, Long visited, Long deals) {
        this.seller = new SellerDTO(seller);
        this.visited = visited;
        this.deals = deals;
    }
}
