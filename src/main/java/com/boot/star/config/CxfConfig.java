package com.boot.star.config;
/**
 * Created by hujichang on 2018/9/28.
 */

import com.boot.star.webService.NetbarServices;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;
/**
 * @author hujichang
 * @ClassName: CxfConfig
 * @Description:
 * @date @create 2018年09月28 9:21
 */

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;
    @Autowired
    private NetbarServices netbarServices;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,netbarServices);
        endpoint.publish("/TestService");//接口发布在 /TestService 目录下
        return endpoint;
    }
}
