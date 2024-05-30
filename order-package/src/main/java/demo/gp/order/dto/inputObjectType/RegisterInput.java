package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import jakarta.annotation.Generated;
import java.lang.String;
import java.time.LocalDate;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;
import org.eclipse.microprofile.graphql.NonNull;

/**
 * 注册信息
 */
@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
@Description("注册信息")
public class RegisterInput {
  /**
   * 姓名
   */
  @NonNull
  @Description("姓名")
  private String name;

  /**
   * 邮箱
   */
  @NonNull
  @Description("邮箱")
  private String email;

  /**
   * 生日
   */
  @Description("生日")
  private LocalDate birthday;

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

  public LocalDate getBirthday() {
    return this.birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}
