package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.Collection;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Type;

/**
 * 订单
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("订单")
public class Order implements Meta {
  /**
   * 订单ID
   */
  @Id
  @Description("订单ID")
  private String id;

  /**
   * 购买用户
   */
  @NonNull
  @Description("购买用户")
  private User user;

  /**
   * 产品列表
   */
  @NonNull
  @Description("产品列表")
  private Collection<OrderItem> items;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "Order";

  private Collection<OrderUserRelation> orderUserRelation;

  private Collection<OrderOrderItemRelation> orderOrderItemRelation;

  private OrderItem itemsAggregate;

  private OrderItemConnection itemsConnection;

  private OrderUserRelation orderUserRelationAggregate;

  private OrderUserRelationConnection orderUserRelationConnection;

  private OrderOrderItemRelation orderOrderItemRelationAggregate;

  private OrderOrderItemRelationConnection orderOrderItemRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Float total;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Collection<OrderItem> getItems() {
    return this.items;
  }

  public void setItems(Collection<OrderItem> items) {
    this.items = items;
  }

  @Override
  public Boolean getIsDeprecated() {
    return this.isDeprecated;
  }

  @Override
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = (Boolean)isDeprecated;
  }

  @Override
  public Integer getVersion() {
    return this.version;
  }

  @Override
  public void setVersion(Integer version) {
    this.version = (Integer)version;
  }

  @Override
  public Integer getRealmId() {
    return this.realmId;
  }

  @Override
  public void setRealmId(Integer realmId) {
    this.realmId = (Integer)realmId;
  }

  @Override
  public String getCreateUserId() {
    return this.createUserId;
  }

  @Override
  public void setCreateUserId(String createUserId) {
    this.createUserId = (String)createUserId;
  }

  @Override
  public LocalDateTime getCreateTime() {
    return this.createTime;
  }

  @Override
  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = (LocalDateTime)createTime;
  }

  @Override
  public String getUpdateUserId() {
    return this.updateUserId;
  }

  @Override
  public void setUpdateUserId(String updateUserId) {
    this.updateUserId = (String)updateUserId;
  }

  @Override
  public LocalDateTime getUpdateTime() {
    return this.updateTime;
  }

  @Override
  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = (LocalDateTime)updateTime;
  }

  @Override
  public String getCreateGroupId() {
    return this.createGroupId;
  }

  @Override
  public void setCreateGroupId(String createGroupId) {
    this.createGroupId = (String)createGroupId;
  }

  public String get__typename() {
    return this.__typename;
  }

  public void set__typename(String __typename) {
    this.__typename = __typename;
  }

  public Collection<OrderUserRelation> getOrderUserRelation() {
    return this.orderUserRelation;
  }

  public void setOrderUserRelation(Collection<OrderUserRelation> orderUserRelation) {
    this.orderUserRelation = orderUserRelation;
  }

  public Collection<OrderOrderItemRelation> getOrderOrderItemRelation() {
    return this.orderOrderItemRelation;
  }

  public void setOrderOrderItemRelation(Collection<OrderOrderItemRelation> orderOrderItemRelation) {
    this.orderOrderItemRelation = orderOrderItemRelation;
  }

  public OrderItem getItemsAggregate() {
    return this.itemsAggregate;
  }

  public void setItemsAggregate(OrderItem itemsAggregate) {
    this.itemsAggregate = itemsAggregate;
  }

  public OrderItemConnection getItemsConnection() {
    return this.itemsConnection;
  }

  public void setItemsConnection(OrderItemConnection itemsConnection) {
    this.itemsConnection = itemsConnection;
  }

  public OrderUserRelation getOrderUserRelationAggregate() {
    return this.orderUserRelationAggregate;
  }

  public void setOrderUserRelationAggregate(OrderUserRelation orderUserRelationAggregate) {
    this.orderUserRelationAggregate = orderUserRelationAggregate;
  }

  public OrderUserRelationConnection getOrderUserRelationConnection() {
    return this.orderUserRelationConnection;
  }

  public void setOrderUserRelationConnection(
      OrderUserRelationConnection orderUserRelationConnection) {
    this.orderUserRelationConnection = orderUserRelationConnection;
  }

  public OrderOrderItemRelation getOrderOrderItemRelationAggregate() {
    return this.orderOrderItemRelationAggregate;
  }

  public void setOrderOrderItemRelationAggregate(
      OrderOrderItemRelation orderOrderItemRelationAggregate) {
    this.orderOrderItemRelationAggregate = orderOrderItemRelationAggregate;
  }

  public OrderOrderItemRelationConnection getOrderOrderItemRelationConnection() {
    return this.orderOrderItemRelationConnection;
  }

  public void setOrderOrderItemRelationConnection(
      OrderOrderItemRelationConnection orderOrderItemRelationConnection) {
    this.orderOrderItemRelationConnection = orderOrderItemRelationConnection;
  }

  public Integer getIdCount() {
    return this.idCount;
  }

  public void setIdCount(Integer idCount) {
    this.idCount = idCount;
  }

  public Integer getIdMax() {
    return this.idMax;
  }

  public void setIdMax(Integer idMax) {
    this.idMax = idMax;
  }

  public Integer getIdMin() {
    return this.idMin;
  }

  public void setIdMin(Integer idMin) {
    this.idMin = idMin;
  }

  public Float getTotal() {
    return this.total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }
}
