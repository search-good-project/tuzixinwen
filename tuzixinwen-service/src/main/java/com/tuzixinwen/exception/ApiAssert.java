package com.tuzixinwen.exception;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * @Author: miansen
 * @Date: 2018/11/17 11:48
 */
public class ApiAssert extends Assert{

    public static void isNull(Object object, String message) {
        if (object != null) {
            throw new ApiException(message);
        }
    }

    public static void isNull(Object object, int code, String message) {
        if (object != null) {
            throw new ApiException(code, message);
        }
    }

    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new ApiException(message);
        }
    }

    public static void notNull(Object object, int code, String message) {
        if (object == null) {
            throw new ApiException(code, message);
        }
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new ApiException(message);
        }
    }

    public static void isTrue(boolean expression, int code, String message) {
        if (!expression) {
            throw new ApiException(code, message);
        }
    }

    public static void notTrue(boolean expression, String message) {
        if (expression) {
            throw new ApiException(message);
        }
    }

    public static void notTrue(boolean expression, int code, String message) {
        if (expression) {
            throw new ApiException(code, message);
        }
    }

    public static void isEmpty(String txt, String message) {
        if (!StringUtils.isEmpty(txt)) {
            throw new ApiException(message);
        }
    }

    public static void isEmpty(String txt, int code, String message) {
        if (!StringUtils.isEmpty(txt)) {
            throw new ApiException(code, message);
        }
    }

    public static void notEmpty(String txt, String message) {
        if (StringUtils.isEmpty(txt)) {
            throw new ApiException(message);
        }
    }

    public static void notEmpty(String txt, int code, String message) {
        if (StringUtils.isEmpty(txt)) {
            throw new ApiException(code, message);
        }
    }
}