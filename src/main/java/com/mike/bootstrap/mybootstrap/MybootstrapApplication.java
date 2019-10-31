package com.mike.bootstrap.mybootstrap;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

// Basically, this tells Spring Boot to start the application by scanning all the classes under ComponentScan.
@SpringBootApplication
@ComponentScan ({"com.mike.bootstrap.mybootstrap.REST", "com.mike.bootstrap.mybootstrap", "com.mike.bootstrap"})
public class MybootstrapApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// Creating the config instance & passing the hibernate config file.
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");

		// Session object to start the db transaction.
		Session s = config.buildSessionFactory().openSession();

		// Transaction object to begin the db transaction.
		Transaction t = s.beginTransaction();

		SpringApplication.run(MybootstrapApplication.class, args);
	}

}
