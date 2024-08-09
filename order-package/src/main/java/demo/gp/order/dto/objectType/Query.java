package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Query {
  private User user;

  private Collection<User> userList;

  private UserConnection userConnection;

  private Product product;

  private Collection<Product> productList;

  private ProductConnection productConnection;

  private Order order;

  private Collection<Order> orderList;

  private OrderConnection orderConnection;

  private OrderItem orderItem;

  private Collection<OrderItem> orderItemList;

  private OrderItemConnection orderItemConnection;

  private UserPhoneNumbersRelation userPhoneNumbersRelation;

  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelationList;

  private UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection;

  private OrderUserRelation orderUserRelation;

  private Collection<OrderUserRelation> orderUserRelationList;

  private OrderUserRelationConnection orderUserRelationConnection;

  private OrderOrderItemRelation orderOrderItemRelation;

  private Collection<OrderOrderItemRelation> orderOrderItemRelationList;

  private OrderOrderItemRelationConnection orderOrderItemRelationConnection;

  private OrderItemProductRelation orderItemProductRelation;

  private Collection<OrderItemProductRelation> orderItemProductRelationList;

  private OrderItemProductRelationConnection orderItemProductRelationConnection;

  private String hello;

  private String helloAsync;

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

  public UserConnection getUserConnection() {
    return this.userConnection;
  }

  public void setUserConnection(UserConnection userConnection) {
    this.userConnection = userConnection;
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

  public ProductConnection getProductConnection() {
    return this.productConnection;
  }

  public void setProductConnection(ProductConnection productConnection) {
    this.productConnection = productConnection;
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

  public OrderConnection getOrderConnection() {
    return this.orderConnection;
  }

  public void setOrderConnection(OrderConnection orderConnection) {
    this.orderConnection = orderConnection;
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

  public OrderItemConnection getOrderItemConnection() {
    return this.orderItemConnection;
  }

  public void setOrderItemConnection(OrderItemConnection orderItemConnection) {
    this.orderItemConnection = orderItemConnection;
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

  public UserPhoneNumbersRelationConnection getUserPhoneNumbersRelationConnection() {
    return this.userPhoneNumbersRelationConnection;
  }

  public void setUserPhoneNumbersRelationConnection(
      UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection) {
    this.userPhoneNumbersRelationConnection = userPhoneNumbersRelationConnection;
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

  public OrderUserRelationConnection getOrderUserRelationConnection() {
    return this.orderUserRelationConnection;
  }

  public void setOrderUserRelationConnection(
      OrderUserRelationConnection orderUserRelationConnection) {
    this.orderUserRelationConnection = orderUserRelationConnection;
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

  public OrderOrderItemRelationConnection getOrderOrderItemRelationConnection() {
    return this.orderOrderItemRelationConnection;
  }

  public void setOrderOrderItemRelationConnection(
      OrderOrderItemRelationConnection orderOrderItemRelationConnection) {
    this.orderOrderItemRelationConnection = orderOrderItemRelationConnection;
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

  public OrderItemProductRelationConnection getOrderItemProductRelationConnection() {
    return this.orderItemProductRelationConnection;
  }

  public void setOrderItemProductRelationConnection(
      OrderItemProductRelationConnection orderItemProductRelationConnection) {
    this.orderItemProductRelationConnection = orderItemProductRelationConnection;
  }

  public String getHello() {
    return this.hello;
  }

  public void setHello(String hello) {
    this.hello = hello;
  }

  public String getHelloAsync() {
    return this.helloAsync;
  }

  public void setHelloAsync(String helloAsync) {
    this.helloAsync = helloAsync;
  }
}
