package com.devsouzx.api.domain.event;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
