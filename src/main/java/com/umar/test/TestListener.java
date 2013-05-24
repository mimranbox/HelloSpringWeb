package com.umar.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("App is going to be closed ... ");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Yayyy! App has started ... ");
	}

}
