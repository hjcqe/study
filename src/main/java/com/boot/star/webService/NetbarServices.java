package com.boot.star.webService;
/**
 * Created by hujichang on 2018/9/28.
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author hujichang
 * @ClassName: NetbarServices
 * @Description:网吧web services 接口
 * @date @create 2018年09月28 9:12
 */

@WebService(name = "TestService", // 暴露服务名称
            targetNamespace = "http://webService.star.boot.com")// 命名空间,一般是接口的包名倒序
public interface NetbarServices {
    @WebMethod
    String sayHello(@WebParam(name = "userName") String name);
}
