package com.boot.star.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.boot.star")
@EnableTransactionManagement//启动事务扫描
@PropertySource(value = {"classpath:jdbc.properties",
        "classpath:application-redis.properties","classpath:application-cxf.properties"})
@MapperScan("com.boot.star.mapper")
public class BootStarApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootStarApplication.class);
    }

    public static void main(String[] args) {
//     启动springboot程序，启动spring容器，启动内嵌的tomcat
        SpringApplication.run(BootStarApplication.class, args);

    }
}
