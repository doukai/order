package demo.gp.order.dto.annotation;

import demo.gp.order.dto.enumType.UserType;
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
public @interface UserInput {
  String id() default "";

  String name() default "";

  String email() default "";

  String[] phoneNumbers() default {};

  UserType userType() default UserType.REGULAR;

  OrderInput1[] orders() default {};

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "User";

  UserPhoneNumbersRelationInput1[] userPhoneNumbersRelation() default {};

  OrderUserRelationInput1[] orderUserRelation() default {};

  UserExpression1 where() default @UserExpression1;

  String $id() default "";

  String $name() default "";

  String $email() default "";

  String $phoneNumbers() default "";

  String $userType() default "";

  String $orders() default "";

  String $isDeprecated() default "";

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

  String $where() default "";
}
