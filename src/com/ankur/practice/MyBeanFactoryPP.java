package com.ankur.practice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPP  implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory bean) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("My bean post processor is called");
	}

}
 
