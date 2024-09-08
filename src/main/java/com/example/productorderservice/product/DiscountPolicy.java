package com.example.productorderservice.product;

// 할인 정책 enum 클래스
public enum DiscountPolicy {
    NONE {
        @Override
        int applyDiscount(final int price) {
            return price;
        }
    },
    FIX_1000_AMOUNT {
        @Override
        int applyDiscount(final int price) {
            return Math.max(price - 1000, 0);
        }
    };

    abstract int applyDiscount(final int price);
}
