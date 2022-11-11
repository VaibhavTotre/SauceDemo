package com.pom;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoginPOM 
{
	public static void main(String[] args) {
		
	
	 Logger log= Logger.getLogger("ZerodhaMaven");
	 
//	 public void method1()
	 {
	 PropertyConfigurator.configure("log4j.properties");
	 log.info("Hello");
	 }
	 
	}
}
