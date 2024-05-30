package demo.gp.order.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.eclipse.microprofile.graphql.Description;

/**
 * 注册信息
 */
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
@Description("注册信息")
public @interface RegisterInput2 {
  /**
   * 姓名
   */
  @Description("姓名")
  String name() default "";

  /**
   * 邮箱
   */
  @Description("邮箱")
  String email() default "";

  /**
   * 生日
   */
  @Description("生日")
  String birthday() default "";

  String $name() default "";

  String $email() default "";

  String $birthday() default "";
}
