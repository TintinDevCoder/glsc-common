package com.dd.common.to;

import lombok.Data;

@Data
public class WareSkuTO {
    /**
     * 仓库id
     */
    private Long wareId;
    /**
     * 库存数
     */
    private Integer stock;
}
