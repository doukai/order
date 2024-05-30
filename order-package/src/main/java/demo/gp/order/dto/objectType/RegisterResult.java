package demo.gp.order.dto.objectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.Integer;
import java.lang.String;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

/**
 * 注册结果
 */
@Type
@CompiledJson
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("注册结果")
public class RegisterResult {
  /**
   * 账号
   */
  @Description("账号")
  private String account;

  /**
   * 密码
   */
  @Description("密码")
  private String password;

  /**
   * 年龄
   */
  @Description("年龄")
  private Integer age;

  public String getAccount() {
    return this.account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
