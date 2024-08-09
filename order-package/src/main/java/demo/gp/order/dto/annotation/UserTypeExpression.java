package demo.gp.order.dto.annotation;

import demo.gp.order.dto.enumType.UserType;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface UserTypeExpression {
  Operator opr() default Operator.EQ;

  UserType val() default UserType.REGULAR;

  UserType[] arr() default {};

  String $opr() default "";

  String $val() default "";

  String $arr() default "";
}
