package cn.rjguanwen.booklib;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @ClassName: PasswordEncTest
 * @Description: TODO
 * @Author: 郑斌
 * @Date: 2019/5/11 10:39
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PasswordEncTest {
    @Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql://localhost:3306/book_lib?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC");
        String name = encryptor.encrypt("******");
        String password = encryptor.encrypt("******");
        System.out.println(url+"----------------");
        System.out.println(name+"----------------");
        System.out.println(password+"----------------");
        Assert.assertTrue(name.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }
}
