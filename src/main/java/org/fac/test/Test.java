package org.fac.test;

import org.fac.test.EmployeeDTO;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test
{

    public static void main(String[] args)
    {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("spring/applicationContext.xml"));
        EmployeeDTO employeeDTO = (EmployeeDTO) factory.getBean("manager");
        System.out.println(employeeDTO.toString());
    }
}