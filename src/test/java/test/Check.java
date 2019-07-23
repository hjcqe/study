package test;
/**
 * Created by hujichang on 2018/11/23.
 */

import com.boot.star.model.TUser;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


/**
 * @author hujichang
 * @ClassName: Check
 * @Description:
 * @date @create 2018年11月23 15:01
 */
public class Check {
    @Test
    public void check(){

        BigDecimal  totalPrice = new BigDecimal("1.110467").setScale(2, BigDecimal.ROUND_UP);
        System.out.println(totalPrice);

        //获取当前月最后一天
//        Calendar ca = Calendar.getInstance();
//        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
//        SimpleDateFormat format = new SimpleDateFormat("dd");
//        String last = format.format(ca.getTime());
//        System.out.println("===============last:"+last);

//        TUser user = new TUser();
//        user.setId(1);
//        user.setName("胡记长");
//
//        TUser user2 = user;
//        user2.setName("史蒂芬森");
//        System.out.println(user.getName());
//        System.out.println(user2.getName());



//        Map<String,Object> map = new HashMap<String,Object>();
//        map.put("user",user);
//        System.out.println(((TUser)map.get("user")).getName());
//
//        Map<String,Object> map2 = new HashMap<String,Object>();
//        map2.put("user",map.get("user"));
//        System.out.println(((TUser)map2.get("user")).getName());
//        ((TUser)map2.get("user")).setName("test");
//
//        System.out.println(((TUser)map.get("user")).getName());


    }

}
