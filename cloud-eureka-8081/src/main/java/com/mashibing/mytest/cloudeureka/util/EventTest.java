package com.mashibing.mytest.cloudeureka.util;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author： Dingpengfei
 * @Description： 监测eureka的服务，当注册或者是下线的时候，可以用来提醒
 * @Date： 2020/6/14 20:15
 */
@Component
public class EventTest {
    @EventListener
    public void sendMail (EurekaInstanceCanceledEvent event){
        //发送邮件
        System.out.println("下线了"+event.toString()+event.isReplication()+event.getAppName());

    }

}
