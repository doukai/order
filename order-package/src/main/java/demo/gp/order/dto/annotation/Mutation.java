package demo.gp.order.dto.annotation;

import jakarta.annotation.Generated;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Mutation {
  UserMutationArguments user() default @UserMutationArguments;

  UserListMutationArguments userList() default @UserListMutationArguments;

  ProductMutationArguments product() default @ProductMutationArguments;

  ProductListMutationArguments productList() default @ProductListMutationArguments;

  OrderMutationArguments order() default @OrderMutationArguments;

  OrderListMutationArguments orderList() default @OrderListMutationArguments;

  OrderItemMutationArguments orderItem() default @OrderItemMutationArguments;

  OrderItemListMutationArguments orderItemList() default @OrderItemListMutationArguments;

  UserPhoneNumbersRelationMutationArguments userPhoneNumbersRelation(
      ) default @UserPhoneNumbersRelationMutationArguments;

  UserPhoneNumbersRelationListMutationArguments userPhoneNumbersRelationList(
      ) default @UserPhoneNumbersRelationListMutationArguments;

  OrderUserRelationMutationArguments orderUserRelation(
      ) default @OrderUserRelationMutationArguments;

  OrderUserRelationListMutationArguments orderUserRelationList(
      ) default @OrderUserRelationListMutationArguments;

  OrderOrderItemRelationMutationArguments orderOrderItemRelation(
      ) default @OrderOrderItemRelationMutationArguments;

  OrderOrderItemRelationListMutationArguments orderOrderItemRelationList(
      ) default @OrderOrderItemRelationListMutationArguments;

  OrderItemProductRelationMutationArguments orderItemProductRelation(
      ) default @OrderItemProductRelationMutationArguments;

  OrderItemProductRelationListMutationArguments orderItemProductRelationList(
      ) default @OrderItemProductRelationListMutationArguments;
}
