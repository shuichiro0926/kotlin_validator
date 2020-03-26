package com.example.demo.validator

import java.math.BigDecimal

/**
 * Numeric Validator.
 */
class NumericValidator {
    /**
     * is null
     **/
    fun isNull(i: Int?): Boolean {
        return i == null
    }

    /**
     * is null
     **/
    fun isNull(l: Long?): Boolean {
        return l == null
    }

    /**
     * is null
     **/
    fun isNull(d: BigDecimal?): Boolean {
        return d == null
    }

    /**
     * Int grater than
     **/
    fun isGraterThan(num: Int, comp: Int): Boolean {
        return num > comp
    }

    /**
     * Long grater than
     **/
    fun isGraterThan(num: Long, comp: Long): Boolean {
        return num > comp
    }

    /**
     * BigDecimal grater than
     **/
    fun isGraterThan(num: BigDecimal, comp: BigDecimal): Boolean {
        return num > comp
    }

    /**
     * Int grater than or equals to
     **/
    fun isGraterThanOrEquals(num: Int, comp: Int): Boolean {
        return num >= comp
    }

    /**
     * Long grater than or equals to
     **/
    fun isGraterThanOrEquals(num: Long, comp: Long): Boolean {
        return num >= comp
    }

    /**
     * BigDecimal grater than or equals to
     **/
    fun isGraterThanOrEquals(num: BigDecimal, comp: BigDecimal): Boolean {
        return (num > comp) or (num.compareTo(comp) == 0)
    }

    /**
     * Int less than
     **/
    fun isLessThan(num: Int, comp: Int): Boolean {
        return num < comp
    }

    /**
     * Long less than
     **/
    fun isLessThan(num: Long, comp: Int): Boolean {
        return num < comp
    }

    /**
     * BigDecimal less than
     **/
    fun isLessThan(num: BigDecimal, comp: BigDecimal): Boolean {
        return num < comp
    }

    /**
     * Int less than or equals to
     **/
    fun isLessThanOrEquals(num: Int, comp: Int): Boolean {
        return num <= comp
    }

    /**
     * Long less than or equals to
     **/
    fun isLessThanOrEquals(num: Long, comp: Int): Boolean {
        return num <= comp
    }

    /**
     * BigDecimal less than or equals to
     **/
    fun isLessThanOrEquals(num: BigDecimal, comp: BigDecimal): Boolean {
        return (num < comp) or (num.compareTo(comp) == 0)
    }
}