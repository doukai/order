package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.api.RegisterResult;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation {
  private User user;

  private Collection<User> userList;

  private Product product;

  private Collection<Product> productList;

  private Order order;

  private Collection<Order> orderList;

  private OrderItem orderItem;

  private Collection<OrderItem> orderItemList;

  private UserPhoneNumbersRelation userPhoneNumbersRelation;

  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList;

  private OrderUserRelation orderUserRelation;

  private Collection<OrderUserRelation> orderUserRelationList;

  private OrderOrderItemRelation orderOrderItemRelation;

  private Collection<OrderOrderItemRelation> orderOrderItemRelationList;

  private OrderItemProductRelation orderItemProductRelation;

  private Collection<OrderItemProductRelation> orderItemProductRelationList;

  private RegisterResult register;

  private Collection<String> countingSheep;

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Collection<User> getUserList() {
    return this.userList;
  }

  public void setUserList(Collection<User> userList) {
    this.userList = userList;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Collection<Product> getProductList() {
    return this.productList;
  }

  public void setProductList(Collection<Product> productList) {
    this.productList = productList;
  }

  public Order getOrder() {
    return this.order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Collection<Order> getOrderList() {
    return this.orderList;
  }

  public void setOrderList(Collection<Order> orderList) {
    this.orderList = orderList;
  }

  public OrderItem getOrderItem() {
    return this.orderItem;
  }

  public void setOrderItem(OrderItem orderItem) {
    this.orderItem = orderItem;
  }

  public Collection<OrderItem> getOrderItemList() {
    return this.orderItemList;
  }

  public void setOrderItemList(Collection<OrderItem> orderItemList) {
    this.orderItemList = orderItemList;
  }

  public UserPhoneNumbersRelation getUserPhoneNumbersRelation() {
    return this.userPhoneNumbersRelation;
  }

  public void setUserPhoneNumbersRelation(UserPhoneNumbersRelation userPhoneNumbersRelation) {
    this.userPhoneNumbersRelation = userPhoneNumbersRelation;
  }

  public Collection<UserPhoneNumbersRelation> getUserPhoneNumbersRelationList() {
    return this.userPhoneNumbersRelationList;
  }

  public void setUserPhoneNumbersRelationList(
      Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList) {
    this.userPhoneNumbersRelationList = userPhoneNumbersRelationList;
  }

  public OrderUserRelation getOrderUserRelation() {
    return this.orderUserRelation;
  }

  public void setOrderUserRelation(OrderUserRelation orderUserRelation) {
    this.orderUserRelation = orderUserRelation;
  }

  public Collection<OrderUserRelation> getOrderUserRelationList() {
    return this.orderUserRelationList;
  }

  public void setOrderUserRelationList(Collection<OrderUserRelation> orderUserRelationList) {
    this.orderUserRelationList = orderUserRelationList;
  }

  public OrderOrderItemRelation getOrderOrderItemRelation() {
    return this.orderOrderItemRelation;
  }

  public void setOrderOrderItemRelation(OrderOrderItemRelation orderOrderItemRelation) {
    this.orderOrderItemRelation = orderOrderItemRelation;
  }

  public Collection<OrderOrderItemRelation> getOrderOrderItemRelationList() {
    return this.orderOrderItemRelationList;
  }

  public void setOrderOrderItemRelationList(
      Collection<OrderOrderItemRelation> orderOrderItemRelationList) {
    this.orderOrderItemRelationList = orderOrderItemRelationList;
  }

  public OrderItemProductRelation getOrderItemProductRelation() {
    return this.orderItemProductRelation;
  }

  public void setOrderItemProductRelation(OrderItemProductRelation orderItemProductRelation) {
    this.orderItemProductRelation = orderItemProductRelation;
  }

  public Collection<OrderItemProductRelation> getOrderItemProductRelationList() {
    return this.orderItemProductRelationList;
  }

  public void setOrderItemProductRelationList(
      Collection<OrderItemProductRelation> orderItemProductRelationList) {
    this.orderItemProductRelationList = orderItemProductRelationList;
  }

  public RegisterResult getRegister() {
    return this.register;
  }

  public void setRegister(RegisterResult register) {
    this.register = register;
  }

  public Collection<String> getCountingSheep() {
    return this.countingSheep;
  }

  public void setCountingSheep(Collection<String> countingSheep) {
    this.countingSheep = countingSheep;
  }
}
