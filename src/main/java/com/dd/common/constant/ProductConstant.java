package com.dd.common.constant;

public class ProductConstant {
    public static final String ATTR_TYPE_BASE = "base";

    public static final String ATTR_TYPE_SALE = "sale";

    public enum AttrEnum {
        ALL_TYPE(2, "全部属性"),
        ATTR_TYPE_BASE(1, "基本属性"),
        ATTR_TYPE_SALE(0, "销售属性");

        private final int code;
        private final String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
