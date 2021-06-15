package yyx.test;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yyx.dao.ManagerMapper;
import yyx.dao.UserInfoMapper;
import yyx.entity.Manager;
import yyx.entity.UserInfo;

import java.util.UUID;


//使用注解进行单元测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class mapperTest {

    @Autowired
    ManagerMapper managerMapper;


    //    批量的sqlSession
    @Autowired
    SqlSession sqlSession;

    /**
     * 测试DepartmentMapper
     */
    @Test
    public void testyyx(){

        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        for(int i = 0; i < 10; i++){
            String uuid = UUID.randomUUID().toString().substring(0, 5) + i;
            mapper.insertSelective(new UserInfo(i,"yyx"+i,"123456"));
        }
        System.out.println("success!!");

    }

}
