import { Seller } from "./seller";

export type Sale = {
    id: number,
    visited: number,
    deals: number,
    amount: number,
    date: string,
    seller: Seller
}

export type SalesPage = {
    content?: Sale[],
    totalElements: number,
    totalPages: number,
    first: boolean,
    last: boolean,
    size?: number,
    number: number,
    numberOfElements?: number,
    empty?: boolean
}

export type SaleSum = {
    seller: Seller,
    sum: number
}

export type SaleSuccess = {
    seller: Seller,
    visited: number,
    deals: number
}