package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.dto.enumType.UserType;
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
 * 用户
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("用户")
public class User implements Meta {
  /**
   * 用户ID
   */
  @Id
  @Description("用户ID")
  private String id;

  /**
   * 用户名
   */
  @NonNull
  @Description("用户名")
  private String name;

  /**
   * 电子邮箱
   */
  @Description("电子邮箱")
  private String email;

  /**
   * 联系方式
   */
  @Description("联系方式")
  private Collection<String> phoneNumbers;

  /**
   * 用户类型
   */
  @NonNull
  @Description("用户类型")
  private UserType userType;

  /**
   * 订单
   */
  @Description("订单")
  private Collection<Order> orders;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "User";

  private Collection<UserPhoneNumbersRelation> userPhoneNumbersRelation;

  private Collection<OrderUserRelation> orderUserRelation;

  private Order ordersAggregate;

  private OrderConnection ordersConnection;

  private UserPhoneNumbersRelation userPhoneNumbersRelationAggregate;

  private UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection;

  private OrderUserRelation orderUserRelationAggregate;

  private OrderUserRelationConnection orderUserRelationConnection;

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer nameCount;

  private String nameMax;

  private String nameMin;

  private Integer emailCount;

  private String emailMax;

  private String emailMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Collection<String> getPhoneNumbers() {
    return this.phoneNumbers;
  }

  public void setPhoneNumbers(Collection<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public UserType getUserType() {
    return this.userType;
  }

  public void setUserType(UserType userType) {
    this.userType = userType;
  }

  public Collection<Order> getOrders() {
    return this.orders;
  }

  public void setOrders(Collection<Order> orders) {
    this.orders = orders;
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

  public Collection<UserPhoneNumbersRelation> getUserPhoneNumbersRelation() {
    return this.userPhoneNumbersRelation;
  }

  public void setUserPhoneNumbersRelation(
      Collection<UserPhoneNumbersRelation> userPhoneNumbersRelation) {
    this.userPhoneNumbersRelation = userPhoneNumbersRelation;
  }

  public Collection<OrderUserRelation> getOrderUserRelation() {
    return this.orderUserRelation;
  }

  public void setOrderUserRelation(Collection<OrderUserRelation> orderUserRelation) {
    this.orderUserRelation = orderUserRelation;
  }

  public Order getOrdersAggregate() {
    return this.ordersAggregate;
  }

  public void setOrdersAggregate(Order ordersAggregate) {
    this.ordersAggregate = ordersAggregate;
  }

  public OrderConnection getOrdersConnection() {
    return this.ordersConnection;
  }

  public void setOrdersConnection(OrderConnection ordersConnection) {
    this.ordersConnection = ordersConnection;
  }

  public UserPhoneNumbersRelation getUserPhoneNumbersRelationAggregate() {
    return this.userPhoneNumbersRelationAggregate;
  }

  public void setUserPhoneNumbersRelationAggregate(
      UserPhoneNumbersRelation userPhoneNumbersRelationAggregate) {
    this.userPhoneNumbersRelationAggregate = userPhoneNumbersRelationAggregate;
  }

  public UserPhoneNumbersRelationConnection getUserPhoneNumbersRelationConnection() {
    return this.userPhoneNumbersRelationConnection;
  }

  public void setUserPhoneNumbersRelationConnection(
      UserPhoneNumbersRelationConnection userPhoneNumbersRelationConnection) {
    this.userPhoneNumbersRelationConnection = userPhoneNumbersRelationConnection;
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

  public Integer getNameCount() {
    return this.nameCount;
  }

  public void setNameCount(Integer nameCount) {
    this.nameCount = nameCount;
  }

  public String getNameMax() {
    return this.nameMax;
  }

  public void setNameMax(String nameMax) {
    this.nameMax = nameMax;
  }

  public String getNameMin() {
    return this.nameMin;
  }

  public void setNameMin(String nameMin) {
    this.nameMin = nameMin;
  }

  public Integer getEmailCount() {
    return this.emailCount;
  }

  public void setEmailCount(Integer emailCount) {
    this.emailCount = emailCount;
  }

  public String getEmailMax() {
    return this.emailMax;
  }

  public void setEmailMax(String emailMax) {
    this.emailMax = emailMax;
  }

  public String getEmailMin() {
    return this.emailMin;
  }

  public void setEmailMin(String emailMin) {
    this.emailMin = emailMin;
  }
}
