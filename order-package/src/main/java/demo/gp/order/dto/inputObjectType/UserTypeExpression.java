package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.dto.enumType.UserType;
import io.graphoenix.core.dto.enumType.Operator;
import jakarta.annotation.Generated;
import java.util.Collection;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class UserTypeExpression {
  @DefaultValue("EQ")
  private Operator opr = Operator.EQ;

  private UserType val;

  private Collection<UserType> arr;

  public Operator getOpr() {
    return this.opr;
  }

  public void setOpr(Operator opr) {
    this.opr = opr;
  }

  public UserType getVal() {
    return this.val;
  }

  public void setVal(UserType val) {
    this.val = val;
  }

  public Collection<UserType> getArr() {
    return this.arr;
  }

  public void setArr(Collection<UserType> arr) {
    this.arr = arr;
  }
}
