package com.example.demo.validator

import java.util.regex.Pattern

/**
 * String validator.
 */
class StringValidator {

    /**
     * Is Null
     */
    fun isNull(str: String?): Boolean {
        return !(str == null || str == "")
    }

    /**
     * string length greater than
     */
    fun isGreaterThan(str: String, i: Int): Boolean {
        return str.length > i
    }

    /**
     * string length greater than or equals
     */
    fun isGreaterThanOrEquals(str: String, i: Int): Boolean {
        return str.length >= i
    }

    /**
     * string length less than
     **/
    fun isLessThan(str: String, i: Int): Boolean {
        return str.length < i
    }

    /**
     * string length less than or equals or
     **/
    fun isLessThanOrEquals(str: String, i: Int): Boolean {
        return str.length <= i
    }

    /**
     * check to string only Fullkana
     **/
    fun isFullkana(str: String): Boolean {
        return Pattern.matches("^[\\u30A0-\\u30FF]+$", str)
    }

    /**
     * check to string only Hiragana
     **/
    fun isHiragana(str: String): Boolean {
        return Pattern.matches("^[\\u3041-\\u3096\\u30FC]+$", str)
    }

    /**
     * check to string only email
     **/
    fun isEmail(str: String): Boolean {
        return Pattern.matches(
                "^[\\w!#%&’/=~\\*\\+\\?\\{\\}\\^\\\$\\-\\|]+(\\.[\\w!#%&'/=~\\*\\+\\?\\{\\}\\^\\\$\\-\\|]+)*@[\\w!#%&’/=~\\*\\+\\?\\{\\}\\^\\\$\\-\\|]+(\\.[\\w!#%&'/=~\\*\\+\\?\\{\\}\\^\\\$\\-\\|]+)*\$", str)
    }

}