package com.chace.mmsj3.jaxrsapi.persistence.ifaces;

//import mmsj3.jaxrsapi.entity.Employee;

import mmsj3.common.models.Employee;

import java.util.List;

public interface IHelloRepository {
			public Employee createEmployee(Employee e);

			public List<Employee> getAllEmployees();

			public Employee findEmployee(Long empId);

			public Employee updateEmployee(Long empId, Employee e);

			public Employee DeleteEmployee(Long empId);
}