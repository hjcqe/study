package com.boot.star.webService;
/**
 * Created by hujichang on 2018/9/28.
 */

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @author hujichang
 * @ClassName: NetbarServicesImpl
 * @Description:网吧web services 接口实现
 * @date @create 2018年09月28 9:15
 */

@WebService(serviceName = "TestService" //与接口中指定的name一致
        ,targetNamespace = "http://webService.star.boot.com" //与接口中的命名空间一致,一般是接口的包名倒
        ,endpointInterface = "com.boot.star.webService.NetbarServices") //接口地址
@Component
public class NetbarServicesImpl implements NetbarServices {
    @Override
    public String sayHello(String name) {
        return "hello:"+name;
    }
}
