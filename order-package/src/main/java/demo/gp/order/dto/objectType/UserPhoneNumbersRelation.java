package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import io.graphoenix.core.dto.interfaceType.Meta;
import jakarta.annotation.Generated;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDateTime;
import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Type;

@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class UserPhoneNumbersRelation implements Meta {
  @Id
  private String id;

  private String userRef;

  private User user;

  private String phoneNumbersRef;

  private Boolean isDeprecated = false;

  private Integer version;

  private Integer realmId;

  private String createUserId;

  private LocalDateTime createTime;

  private String updateUserId;

  private LocalDateTime updateTime;

  private String createGroupId;

  private String __typename = "UserPhoneNumbersRelation";

  private Integer idCount;

  private Integer idMax;

  private Integer idMin;

  private Integer userRefCount;

  private String userRefMax;

  private String userRefMin;

  private Integer phoneNumbersRefCount;

  private String phoneNumbersRefMax;

  private String phoneNumbersRefMin;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getUserRef() {
    return this.userRef;
  }

  public void setUserRef(String userRef) {
    this.userRef = userRef;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public String getPhoneNumbersRef() {
    return this.phoneNumbersRef;
  }

  public void setPhoneNumbersRef(String phoneNumbersRef) {
    this.phoneNumbersRef = phoneNumbersRef;
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

  public Integer getUserRefCount() {
    return this.userRefCount;
  }

  public void setUserRefCount(Integer userRefCount) {
    this.userRefCount = userRefCount;
  }

  public String getUserRefMax() {
    return this.userRefMax;
  }

  public void setUserRefMax(String userRefMax) {
    this.userRefMax = userRefMax;
  }

  public String getUserRefMin() {
    return this.userRefMin;
  }

  public void setUserRefMin(String userRefMin) {
    this.userRefMin = userRefMin;
  }

  public Integer getPhoneNumbersRefCount() {
    return this.phoneNumbersRefCount;
  }

  public void setPhoneNumbersRefCount(Integer phoneNumbersRefCount) {
    this.phoneNumbersRefCount = phoneNumbersRefCount;
  }

  public String getPhoneNumbersRefMax() {
    return this.phoneNumbersRefMax;
  }

  public void setPhoneNumbersRefMax(String phoneNumbersRefMax) {
    this.phoneNumbersRefMax = phoneNumbersRefMax;
  }

  public String getPhoneNumbersRefMin() {
    return this.phoneNumbersRefMin;
  }

  public void setPhoneNumbersRefMin(String phoneNumbersRefMin) {
    this.phoneNumbersRefMin = phoneNumbersRefMin;
  }
}
