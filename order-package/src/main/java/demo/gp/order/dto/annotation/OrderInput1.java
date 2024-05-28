package demo.gp.order.dto.annotation;

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
public @interface OrderInput1 {
  String id() default "";

  UserInput2 user() default @UserInput2;

  OrderItemInput2[] items() default {};

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "Order";

  OrderUserRelationInput2[] orderUserRelation() default {};

  OrderOrderItemRelationInput2[] orderOrderItemRelation() default {};

  OrderExpression2 where() default @OrderExpression2;

  String $id() default "";

  String $user() default "";

  String $items() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $orderUserRelation() default "";

  String $orderOrderItemRelation() default "";

  String $where() default "";
}
