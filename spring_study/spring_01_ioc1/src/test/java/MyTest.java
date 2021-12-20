import com.tao.dao.UserDaoImpl1;
import com.tao.dao.UserDaoImpl2;
import com.tao.service.UserService;
import com.tao.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //userService在spring中创建，其中的对象也在spring中创建，并在配置文件中配置
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }
//    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoImpl2());
//        userService.getUser();
//    }

}
