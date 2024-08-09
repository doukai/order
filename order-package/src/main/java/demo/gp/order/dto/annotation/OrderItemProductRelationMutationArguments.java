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
public @interface OrderItemProductRelationMutationArguments {
  String id() default "";

  String orderItemRef() default "";

  OrderItemInput orderItem() default @OrderItemInput;

  String productRef() default "";

  ProductInput product() default @ProductInput;

  boolean isDeprecated() default false;

  int version() default 0;

  int realmId() default 0;

  String createUserId() default "";

  String createTime() default "";

  String updateUserId() default "";

  String updateTime() default "";

  String createGroupId() default "";

  String __typename() default "OrderItemProductRelation";

  OrderItemProductRelationInput input() default @OrderItemProductRelationInput;

  OrderItemProductRelationExpression where() default @OrderItemProductRelationExpression;

  String $id() default "";

  String $orderItemRef() default "";

  String $orderItem() default "";

  String $productRef() default "";

  String $product() default "";

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
