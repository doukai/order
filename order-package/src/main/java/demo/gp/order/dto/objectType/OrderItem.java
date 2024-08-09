package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
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
 * 订单项
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("订单项")
public class OrderItem implements Meta {
  /**
   * 订单项ID
   */
  @Id
  @Description("订单项ID")
  private String id;

  /**
   * 产品
   */
  @NonNull
  @Description("产品")
  private Product product;

  /**
   * 购买数量
   */
  @NonNull
  @Description("购买数量")
  private Integer quantity;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "OrderItem";

  private Collection<OrderItemProductRelation> orderItemProductRelation;

  private OrderItemProductRelation orderItemProductRelationAggregate;

  private OrderItemProductRelationConnection orderItemProductRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer quantityCount;

  private Integer quantitySum;

  private Integer quantityAvg;

  private Integer quantityMax;

  private Integer quantityMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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

  public Collection<OrderItemProductRelation> getOrderItemProductRelation() {
    return this.orderItemProductRelation;
  }

  public void setOrderItemProductRelation(
      Collection<OrderItemProductRelation> orderItemProductRelation) {
    this.orderItemProductRelation = orderItemProductRelation;
  }

  public OrderItemProductRelation getOrderItemProductRelationAggregate() {
    return this.orderItemProductRelationAggregate;
  }

  public void setOrderItemProductRelationAggregate(
      OrderItemProductRelation orderItemProductRelationAggregate) {
    this.orderItemProductRelationAggregate = orderItemProductRelationAggregate;
  }

  public OrderItemProductRelationConnection getOrderItemProductRelationConnection() {
    return this.orderItemProductRelationConnection;
  }

  public void setOrderItemProductRelationConnection(
      OrderItemProductRelationConnection orderItemProductRelationConnection) {
    this.orderItemProductRelationConnection = orderItemProductRelationConnection;
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

  public Integer getQuantityCount() {
    return this.quantityCount;
  }

  public void setQuantityCount(Integer quantityCount) {
    this.quantityCount = quantityCount;
  }

  public Integer getQuantitySum() {
    return this.quantitySum;
  }

  public void setQuantitySum(Integer quantitySum) {
    this.quantitySum = quantitySum;
  }

  public Integer getQuantityAvg() {
    return this.quantityAvg;
  }

  public void setQuantityAvg(Integer quantityAvg) {
    this.quantityAvg = quantityAvg;
  }

  public Integer getQuantityMax() {
    return this.quantityMax;
  }

  public void setQuantityMax(Integer quantityMax) {
    this.quantityMax = quantityMax;
  }

  public Integer getQuantityMin() {
    return this.quantityMin;
  }

  public void setQuantityMin(Integer quantityMin) {
    this.quantityMin = quantityMin;
  }
}
