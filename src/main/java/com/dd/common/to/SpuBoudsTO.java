package com.dd.common.to;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class SpuBoudsTO {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
