package demo.gp.order.dto.inputObjectType;

import com.dslplatform.json.CompiledJson;
import demo.gp.order.api.RegisterInput;
import jakarta.annotation.Generated;
import org.eclipse.microprofile.graphql.Input;

@CompiledJson
@Input
@Generated("io.graphoenix.java.builder.TypeSpecBuilder_Proxy")
public class Mutation_register_Arguments {
  private RegisterInput registerInput;

  public RegisterInput getRegisterInput() {
    return this.registerInput;
  }

  public void setRegisterInput(RegisterInput registerInput) {
    this.registerInput = registerInput;
  }
}
