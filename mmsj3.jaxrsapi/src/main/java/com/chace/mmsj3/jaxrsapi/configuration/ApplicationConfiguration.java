package com.chace.mmsj3.jaxrsapi.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.chace.mmsj3.jaxrsapi")
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:db.properties"),
		@PropertySource(value = "classpath:root.properties", ignoreResourceNotFound = true)})
public class ApplicationConfiguration {

			@Value("${ROOT_PROPERTY:Default}")
			private String rootProperty;
			@Value("${java.home}")
			private String javaHome;

			@Value("Test")
			public void printValues(String s, @Value("another variable") String v) {
						System.out.println("");
						System.out.println("***************************************************");
						System.out.println("************ ApplicationConfiguration class *******");
						System.out.println("***************************************************");
						System.out.println("Java Home = " + javaHome);
						System.out.println("root property  = " + rootProperty);
						System.out.println("***************************************************");
			}
}
