package yyx.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yyx.dao.ManagerMapper;
import yyx.entity.Manager;


//使用注解进行单元测试
public class mapperTest {
    public static void main(String argc[]){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerMapper managerMapper=ioc.getBean(ManagerMapper.class);


        managerMapper.insert(new Manager(1,"yyx","123456"));
        System.out.println(managerMapper);
    }
}
