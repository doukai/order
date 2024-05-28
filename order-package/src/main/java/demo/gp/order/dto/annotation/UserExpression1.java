package demo.gp.order.dto.annotation;

import io.graphoenix.core.dto.annotation.IntExpression2;
import io.graphoenix.core.dto.annotation.StringExpression2;
import io.graphoenix.core.dto.enumType.Conditional;
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
public @interface UserExpression1 {
  StringExpression2 id() default @StringExpression2;

  StringExpression2 name() default @StringExpression2;

  StringExpression2 email() default @StringExpression2;

  StringExpression2 phoneNumbers() default @StringExpression2;

  UserTypeExpression2 userType() default @UserTypeExpression2;

  OrderExpression2 orders() default @OrderExpression2;

  boolean includeDeprecated() default false;

  IntExpression2 version() default @IntExpression2;

  IntExpression2 realmId() default @IntExpression2;

  StringExpression2 createUserId() default @StringExpression2;

  StringExpression2 createTime() default @StringExpression2;

  StringExpression2 updateUserId() default @StringExpression2;

  StringExpression2 updateTime() default @StringExpression2;

  StringExpression2 createGroupId() default @StringExpression2;

  StringExpression2 __typename() default @StringExpression2;

  UserPhoneNumbersRelationExpression2 userPhoneNumbersRelation(
      ) default @UserPhoneNumbersRelationExpression2;

  OrderUserRelationExpression2 orderUserRelation() default @OrderUserRelationExpression2;

  boolean not() default false;

  Conditional cond() default Conditional.AND;

  UserExpression2[] exs() default {};

  String $id() default "";

  String $name() default "";

  String $email() default "";

  String $phoneNumbers() default "";

  String $userType() default "";

  String $orders() default "";

  String $includeDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $userPhoneNumbersRelation() default "";

  String $orderUserRelation() default "";

  String $not() default "";

  String $cond() default "";

  String $exs() default "";
}
