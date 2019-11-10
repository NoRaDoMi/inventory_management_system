package vn.hcmus.fit.inventory.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import vn.hcmus.fit.inventory.entity.Users;
import vn.hcmus.fit.inventory.service.UsersService;

import java.util.List;


/**
 * Created by Asus on 11/10/2019.
 */
@Component
public class LoginValidator implements Validator {
    @Autowired
    private UsersService usersService;

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass == Users.class;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Users user = (Users) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName","NotEmpty.users.userName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","NotEmpty.users.password");

        if(!StringUtils.isEmpty(user.getUserName()) && !StringUtils.isEmpty(user.getPassword())){
            List<Users> users = usersService.findByProperty("userName",user.getUserName());
            if(users != null && !users.isEmpty()){
                if(!users.get(0).getPassword().equals(user.getPassword())){
                    errors.rejectValue("password","Wrong.users.password");
                }
            }
            else{
                errors.rejectValue("userName","Wrong.users.userName");
            }
        }
    }
}
