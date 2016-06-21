package com.sspuiur.util;

import org.springframework.beans.BeansException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContentHelper implements ApplicationContextAware{

	private static ApplicationContext context;
	
	@SuppressWarnings("static-access")
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}
	public static ApplicationContext getContext() {
		return context;
	}


}