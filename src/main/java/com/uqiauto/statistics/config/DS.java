package com.uqiauto.statistics.config;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author huzhiting
 * @version 1.0
 * <p>
 * <p>
 * History:
 * <p>
 * Date                 Author         Version     Description
 * ---------------------------------------------------------------------------------
 * 2018/5/12 15:24         huzhiting          1.0         To create
 * </p>
 * @see
 * @since
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DS {
    String value() default "datasource1";
}