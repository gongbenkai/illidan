package test;

import com.gong.illidan.Application;
import com.gong.illidan.dao.model.User;
import com.gong.illidan.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class Test {
    
    @Autowired
    private UserService userService;
    
    @org.junit.Test
    public void test() {
        User user = new User();
        user.setUserName("usernametest");
        user.setEmail("emaitest@test.com");
        System.out.println(userService.addUser(user));
    }
}
