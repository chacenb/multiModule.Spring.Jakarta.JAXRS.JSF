package com.chace.mmsj3.jaxrsapi.resource;

//import jakarta.ws.rs.core.Response;
//import mmsj3.common.models.IEmployee;
//import mmsj3.common.models.ifaces.IResponse;

import com.chace.mmsj3.jaxrsapi.service.HelloService;
import mmsj3.common.models.Employee;
import mmsj3.common.models.Response;
import mmsj3.common.resources.IHelloResource;
//import mmsj3.jaxrsapi.entity.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


@Component
public class HelloResource implements IHelloResource {

			private static final Logger LOG = LogManager.getLogger(HelloResource.class);

			@Value("${java.home}")
			private String javaHome;
			@Value("${DB_DRIVER_CLASS}")
			private String driverClass;
			@Value("${DB_URL}")
			private String dbURL;
			@Value("${DB_USERNAME}")
			private String userName;
			@Value("${DB_PASSWORD}")
			private char[] password;

			private final HelloService helloService;

			@Autowired
			public HelloResource(HelloService service) {
						this.helloService = service;
			}

			@Override
			public Response index() {
						helloService.printDBConfigs();
//						return jakarta.ws.rs.core.Response.status(200).header("Access-Control-Allow-Origin", "*")
//								.header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
//								.header("Access-Control-Allow-Credentials", "true")
//								.header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD").entity("").build();
						return new Response();
			}

			@Override
			public Response getAllEmployees() {
						LOG.info("api resource > /");
						return new Response(helloService.getAllEmployees());
			}

			@Override
			public Response createEmployee(mmsj3.common.models.Employee employee) throws Exception {
						LOG.info("api resource > createEmployee");
						Employee emp = null;

						try {
									emp = helloService.createEmployee(employee);
						} catch (Exception e) {
									LOG.error("api resource > createEmployee");
									throw new Exception(e);
						}

						return (emp == null) ? new Response(null, "Erreur lors de la création de l'employé") : new Response(emp);
			}
}
