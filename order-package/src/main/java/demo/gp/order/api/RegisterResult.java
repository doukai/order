package demo.gp.order.api;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Type;

@Type
public class RegisterResult {

    @Description("账号")
    private String account;

    @Description("密码")
    private String password;

    @Description("年龄")
    private Integer age;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
