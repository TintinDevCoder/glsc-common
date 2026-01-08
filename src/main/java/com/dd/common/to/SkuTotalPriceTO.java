package com.dd.common.to;

import lombok.Data;

@Data
public class SkuTotalPriceTO {
    private Long skuId;
    private Integer num;
    private String skuName;
    private String skuDesc;
    private String skuImg;
    private String price;
    private String totalPrice;
}
