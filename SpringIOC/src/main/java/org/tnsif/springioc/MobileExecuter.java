package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//program to demonstrate on Spring IOC

public class MobileExecuter {

	public static void main(String[] args) {
		
		//hard coding
		/*Airtel a= new Airtel();
		a.call();
		a.message();
		
		jio j=new jio();
		j.call();
		j.message();*/
		
		ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("bean.xml");
		Airtel a=(Airtel)c.getBean("Airtel");
		a.call();
		a.message();
		
	
		/*jio j=(jio) c.getBean("jio");
		a.call();
		a.message();*/
		
		sim s=c.getBean("sim",sim.class);
		s.call();
		s.message();
			
		sim s1=c.getBean("sim1",sim.class);
		s.call();
		s.message();
			
		

	}

}
