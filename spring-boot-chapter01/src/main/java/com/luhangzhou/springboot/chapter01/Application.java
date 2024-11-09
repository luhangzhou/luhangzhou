package com.luhangzhou.springboot.chapter01;

import com.luhangzhou.springboot.chapter01.config.AppConfig;
import com.luhangzhou.springboot.chapter01.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:891922176@QQ.COM">Lu Hangzhou</a>
 */
@Slf4j
public class Application
{
    public static void main(String[] args)
    {
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(AppConfig.class);
        User user = applicationContext.getBean(User.class);
        log.info("user.id:{}",user.getId());
        log.info("user.name:{}",user.getName());
        log.info("user.note:{}",user.getNote());
    }
}
