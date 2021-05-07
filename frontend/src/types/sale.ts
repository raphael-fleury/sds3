import { Seller } from "./seller";

export type SaleSum = {
    seller: Seller,
    sum: number
}

export type SaleSuccess = {
    seller: Seller,
    visited: number,
    deals: number
}