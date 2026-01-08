package com.dd.common.constant;

/**
 * 仓库模块常量类
 * 包含采购单和采购明细的状态枚举
 */
public class WareConstant {

    /**
     * 采购单状态枚举
     * 0：新建、1：已分配、2：已领取、3：已完成、4：有异常
     */
    public enum PurchaseStatusEnum {

        /**
         * 新建
         */
        NEW(0, "新建"),

        /**
         * 已分配
         */
        ASSIGNED(1, "已分配"),

        /**
         * 已领取
         */
        RECEIVED(2, "已领取"),

        /**
         * 已完成
         */
        FINISHED(3, "已完成"),

        /**
         * 有异常
         */
        ERROR(4, "有异常");

        /**
         * 状态码（实际存到数据库的值）
         */
        private final int code;

        /**
         * 状态描述
         */
        private final String desc;

        PurchaseStatusEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        /**
         * 获取状态码
         */
        public int getCode() {
            return code;
        }

        /**
         * 获取状态描述
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 根据 code 获取枚举
         *
         * @param code 状态码
         * @return 对应的枚举，找不到时返回 null
         */
        public static PurchaseStatusEnum fromCode(Integer code) {
            if (code == null) {
                return null;
            }
            for (PurchaseStatusEnum value : values()) {
                if (value.code == code) {
                    return value;
                }
            }
            return null;
        }
    }

    /**
     * 采购明细状态枚举
     * 0：新建、1：已分配、2：正在采购、3：已完成、4：采购失败
     */
    public enum PurchaseDetailStatusEnum {

        /**
         * 新建
         */
        NEW(0, "新建"),

        /**
         * 已分配
         */
        ASSIGNED(1, "已分配"),

        /**
         * 正在采购
         */
        PURCHASING(2, "正在采购"),

        /**
         * 已完成
         */
        FINISHED(3, "已完成"),

        /**
         * 采购失败
         */
        FAILED(4, "采购失败");

        /**
         * 状态码（实际存到数据库的值）
         */
        private final int code;

        /**
         * 状态描述
         */
        private final String desc;

        PurchaseDetailStatusEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        /**
         * 获取状态码
         */
        public int getCode() {
            return code;
        }

        /**
         * 获取状态描述
         */
        public String getDesc() {
            return desc;
        }

        /**
         * 根据 code 获取枚举
         *
         * @param code 状态码
         * @return 对应的枚举，找不到时返回 null
         */
        public static PurchaseDetailStatusEnum fromCode(Integer code) {
            if (code == null) {
                return null;
            }
            for (PurchaseDetailStatusEnum value : values()) {
                if (value.code == code) {
                    return value;
                }
            }
            return null;
        }
    }
}
