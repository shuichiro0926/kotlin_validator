package com.example.demo.validator

import java.time.LocalDateTime

/**
 * Date validator.
 */
class DateValidator {
    /**
     * is null
     **/
    fun isNull(d: LocalDateTime?): Boolean {
        return d == null
    }

    /**
     * date grater than
     **/
    fun isGraterThan(d: LocalDateTime, comp: LocalDateTime): Boolean {
        return d.isAfter(comp)
    }

    /**
     * date grater than or equals to
     **/
    fun isGraterThanOrEquals(d: LocalDateTime, comp: LocalDateTime): Boolean {
        return (d.isAfter(comp)) or (d.isEqual(comp))
    }

    /**
     * date less than
     **/
    fun isLessThan(d: LocalDateTime, comp: LocalDateTime): Boolean {
        return d.isBefore(comp)
    }

    /**
     * date less than or equals to
     **/
    fun isLessThanOrEquals(d: LocalDateTime, comp: LocalDateTime): Boolean {
        return (d.isBefore(comp)) or (d.isEqual(comp))
    }
}