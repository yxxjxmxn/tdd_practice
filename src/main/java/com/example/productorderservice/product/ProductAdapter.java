package com.example.productorderservice.product;

import org.springframework.stereotype.Component;

@Component
class ProductAdapter implements ProductPort {
    private final ProductRepository productRepository;

    // 생성자 주입
    ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // 상품 등록
    @Override
    public void save(final Product product) {
        productRepository.save(product);
    }

    // 상품 조회
    @Override
    public Product getProduct(final Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다!"));
    }
}
