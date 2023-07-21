package com.chace.mmsj3.jaxrsapi.service;

import mmsj3.common.models.Employee;
import com.chace.mmsj3.jaxrsapi.persistence.HelloRepository;
import com.chace.mmsj3.jaxrsapi.service.ifaces.IHelloService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class HelloService implements IHelloService {
			private static final Logger LOG = LogManager.getLogger(HelloService.class);

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

			private final HelloRepository helloRepository;

			@Autowired
			public HelloService(HelloRepository repo) {
						this.helloRepository = repo;
			}

			@Override
			public Employee createEmployee(Employee e) {
						LOG.info("HelloService > createEmployee ");
						return helloRepository.createEmployee(e);
			}

			@Override
			public List<Employee> getAllEmployees() {
						LOG.info("HelloService > getAllEmployees ");
						return helloRepository.getAllEmployees();
			}

			@Override
			public Employee updateEmployee(Long empId, Employee e) {
						LOG.info("HelloService > updateEmployee ");
						return null;
			}

			@Override
			public Employee DeleteEmployee(Long empId) {
						LOG.info("HelloService > DeleteEmployee ");
						return null;
			}

			public void printDBConfigs() {
						System.out.println("");
						System.out.println("***************************************************");
						System.out.println("************ READING DB.PROPERTIES VALUES **********");
						System.out.println("***************************************************");
						System.out.println("Driver Class = " + driverClass);
						System.out.println("DB URL = " + dbURL);
						System.out.println("User Name = " + userName);
						System.out.println("Password = " + String.valueOf(password));
						System.out.println("***************************************************");
						System.out.println("");

			}
}
