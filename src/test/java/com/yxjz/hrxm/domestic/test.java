package com.yxjz.hrxm.domestic;


import com.yxjz.hrxm.domestic.user.DomesticApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DomesticApplication.class)
public class test {

  /*  @Autowired
    private UserMapper usermapper;*/

    @Test
    public void test01(){
      /*String name = usermapper.selectById("00");*/
        System.out.println(11);

    }

}
