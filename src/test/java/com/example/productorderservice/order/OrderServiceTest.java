package com.example.productorderservice.order;

import com.example.productorderservice.product.ProductService;
import com.example.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @Test
    void 상품주문() {

        // 상품 등록
        productService.addProduct(ProductSteps.상품등록요청_생성());
        
        // 상품 주문
        final CreateOrderRequest request = 상품주문요청_생성();

        // 주문 생성
        orderService.createOrder(request);
    }

    private static CreateOrderRequest 상품주문요청_생성() {
        final Long productId = 1L;
        final int quantity = 2;
        return new CreateOrderRequest(productId, quantity);
    }
}
