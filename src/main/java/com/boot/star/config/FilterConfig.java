package com.boot.star.config;
/**
 * Created by hujichang on 2018/9/28.
 */

import com.boot.star.filter.MyFilter;
import com.boot.star.filter.MyFilter1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hujichang
 * @ClassName: WebComponent2Config
 * @Description:
 * @date @create 2018年09月28 14:11
 */
@Configuration
public class FilterConfig {

    @Autowired
    private MyFilter myFilter;
    @Autowired
    private MyFilter1 myFilter1;

    @Bean
    public FilterRegistrationBean someFilterRegistration1() {
        //新建过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 添加我们写好的过滤器
        registration.setFilter(myFilter);
        // 设置过滤器的URL模式
        registration.addUrlPatterns("/text/*");
        // 设置过滤器的优先级
        registration.setOrder(2);

        return registration;
    }

    @Bean
    public FilterRegistrationBean someFilterRegistration2() {
        //新建过滤器注册类
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 添加我们写好的过滤器
        registration.setFilter(myFilter1);
        // 设置过滤器的URL模式
        registration.addUrlPatterns("/text/*");
        // 设置过滤器的优先级
        registration.setOrder(1);

        return registration;
    }
}
