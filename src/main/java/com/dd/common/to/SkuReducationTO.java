package com.dd.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class SkuReducationTO {
    private Long skuId;
    private Integer fullCount;
    private BigDecimal discount;
    private Integer countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private Integer priceStatus;
    private List<MemberPrice> memberPrice;
}
