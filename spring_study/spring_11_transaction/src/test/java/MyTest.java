import com.tao.mapper.UserMapper;
import com.tao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2",UserMapper.class);
        for (User user : userMapper.selectAllUser()) {
            System.out.println(user);
        }
    }
}
