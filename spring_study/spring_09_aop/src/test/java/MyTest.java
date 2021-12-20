import com.tao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //在配置文件中配置了userServiceImpl的代理类，所以获取到的是代理类，用接口接收
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
