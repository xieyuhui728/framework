package com.xieyuhui.spring.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Auther: xieyuhui
 * @Date: 2019-01-27 15:59
 * @Description:
 */
public class IocPRogrammatic {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext;
        ClassPathResource resource = new ClassPathResource("");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
    }
}
