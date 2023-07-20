package com.chace.mmsj3.jaxrsapi;

//import com.chace.mmsj3.jaxrsapi.configuration.ApplicationConfiguration;

//import com.chace.mmsj3.jaxrsapi.configuration.ApplicationConfiguration_;
import com.chace.mmsj3.jaxrsapi.resource.HelloResource;
import com.chace.mmsj3.jaxrsapi.service.HelloService;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@ApplicationPath("/api")
public class JAXRSApiApplication extends Application { }