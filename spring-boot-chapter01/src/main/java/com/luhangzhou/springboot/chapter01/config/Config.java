package com.luhangzhou.springboot.chapter01.config;

import com.luhangzhou.springboot.chapter01.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author <a href="mailto:891922176@QQ.COM">Lu Hangzhou</a>
 */
@Configuration
public class Config
{
    @Bean(name="user")
    public User initUser()
    {
        User user = new User();
        user.setId(1L);
        user.setName("luhangzhou");
        user.setNote("node_1");
        return user;
    }
}
