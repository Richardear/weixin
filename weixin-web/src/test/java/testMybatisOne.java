import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tencent.domain.User;
import com.tencent.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)     //��ʾ�̳���SpringJUnit4ClassRunner��  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class testMybatisOne {
	  
/*    private static Logger logger = Logger.getLogger(TestMyBatisOne.class);  
*/     //private ApplicationContext ac = null;  
    @Autowired
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById("1");  
         System.out.println(user.getUserName());  
         //logger.info("ֵ��"+user.getUserName());  
/*        logger.info(JSON.toJSONString(user));  
*/    }  
}
