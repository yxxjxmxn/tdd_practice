package com.example.productorderservice.product;

interface ProductPort {

    // 상품 등록
    void save(final Product product);

    // 상품 조회
    Product getProduct(Long productId);
}
