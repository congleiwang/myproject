package wang.conglei.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.ServletContext;

/**
 * @program: springTest
 * @description: Spring辅助类
 * @author: conglei.Wang
 * @create: 2018-07-17 23:25
 **/
@Component("springHelper")
public class SpringHelper implements ApplicationContextAware {
    private static XmlWebApplicationContext applicationContext;

    public SpringHelper() {
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext = (XmlWebApplicationContext)applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static XmlWebApplicationContext getXmlWebApplicationContext() {
        return applicationContext;
    }

    public static ServletContext getServletContext() {
        return applicationContext.getServletContext();
    }

    public static Object getBean(String name) throws BeansException {
        return applicationContext.getBean(name);
    }
}