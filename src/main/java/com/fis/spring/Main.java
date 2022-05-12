package com.fis.spring;

import com.fis.spring.service.SampleServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.fis.spring.Main
 * Author TungHuynh - sondt18@fpt.com.vn
 * Date 21-Mar-22 03:32 PM
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SampleServiceImpl sampleImpl = (SampleServiceImpl)applicationContext.getBean("sampleService");
        sampleImpl.printSampleMessage();
    }
}
