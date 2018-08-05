package com.annotest.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.FIELD })
public @interface Excel {
	/**
	 * 列头名称
	 */
	public abstract String name() default "";

	/**
	 * 是否导出数据,应对需求:有时我们需要导出一份模板,这是标题需要但内容需要用户手工填写.
	 */
	public abstract boolean isExport() default false;

	/**
	 * 配置列的名称,对应A,B,C,D....
	 */
	public abstract String column();

	/**
	 * 是否必填
	 */
	public abstract boolean isrequire() default false;

	/**
	 * 提示信息
	 */
	public abstract String prompt() default "";

	/**
	 * 设置只能选择不能输入的列内容.
	 */
	public abstract String combo() default "";

}
