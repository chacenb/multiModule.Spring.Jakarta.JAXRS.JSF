/*
package com.chace.mmsj3.jaxrsapi.configuration;

import com.chace.mmsj3.jaxrsapi.persistence.HelloRepository;
import com.chace.mmsj3.jaxrsapi.resource.HelloResource;
import com.chace.mmsj3.jaxrsapi.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.chace.mmsj3")
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:db.properties"),
		@PropertySource(value = "classpath:root.properties", ignoreResourceNotFound = true)})
public class ApplicationConfiguration {

//			ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

			@Value("initial Value")
			private String initializedValue;
			@Value("true")
			private boolean initializedBoolean;
			@Value("10")
			private int initializedInt;
			@Value("${APP_NAME_NOT_FOUND:Default}")
			private String defaultAppName;
			@Value("${java.home}")
			private String javaHome;

			*/
/* initialize beans here *//*


			@Bean
			public HelloRepository getRepo() {
						return new HelloRepository();
			}

//			@Bean
//			public HelloService getService() {
//						return new HelloService(getRepo());
//			}
			@Bean
			public HelloService getService() {
						return new HelloService();
			}

//			@Bean
//			public HelloResource getResource() {
//						return new HelloResource(getService());
//			}

			@Value("Test")
			public void printValues(String s, @Value("another variable") String v) {
						System.out.println("");
						System.out.println("***************************************************");
						System.out.println("************ ApplicationConfiguration *******");
						System.out.println("***************************************************");
						System.out.println("************ INPUT ARGUMENTS *******");
						System.out.println("Input Argument 1 = " + s + " Input Argument 2 = " + v);
						System.out.println("Default Configuration Name = " + initializedValue);
						System.out.println("Boolean = " + initializedBoolean);
						System.out.println("Int = " + initializedInt);
						System.out.println("Java Home = " + javaHome);
						System.out.println("Default App Name = " + defaultAppName);
						System.out.println("***************************************************");
			}
}
*/
