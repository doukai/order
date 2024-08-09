package demo.gp.order.api;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.Input;

import java.time.LocalDate;

@Input
public class RegisterInput {

    @Description("姓名")
    private String name;

    @Description("邮箱")
    private String email;

    @Description("生日")
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
