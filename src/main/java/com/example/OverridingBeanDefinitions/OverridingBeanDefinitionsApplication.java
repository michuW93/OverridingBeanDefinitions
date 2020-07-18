package com.example.OverridingBeanDefinitions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OverridingBeanDefinitionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OverridingBeanDefinitionsApplication.class, args);

		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(
						Configuration1.class, Configuration2.class);

		Foo foo = applicationContext.getBean(Foo.class);
		System.out.println(foo.getName());
	}
}