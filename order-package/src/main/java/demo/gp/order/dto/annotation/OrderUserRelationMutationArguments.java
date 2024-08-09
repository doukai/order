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
public @interface OrderUserRelationMutationArguments {
  String id() default "";

  String userRef() default "";

  UserInput user() default @UserInput;

  String orderRef() default "";

  OrderInput order() default @OrderInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "OrderUserRelation";

  OrderUserRelationInput input() default @OrderUserRelationInput;

  OrderUserRelationExpression where() default @OrderUserRelationExpression;

  String $id() default "";

  String $userRef() default "";

  String $user() default "";

  String $orderRef() default "";

  String $order() default "";

  String $isDeprecated() default "";

  String $version() default "";

  String $realmId() default "";

  String $createUserId() default "";

  String $createTime() default "";

  String $updateUserId() default "";

  String $updateTime() default "";

  String $createGroupId() default "";

  String $__typename() default "";

  String $input() default "";

  String $where() default "";
}
