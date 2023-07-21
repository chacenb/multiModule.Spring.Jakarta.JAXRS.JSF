package com.chace.mmsj3.jaxrsapi.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import mmsj3.common.models.Employee;
import com.chace.mmsj3.jaxrsapi.persistence.ifaces.IHelloRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloRepository implements IHelloRepository {

			private static final Logger LOG = LogManager.getLogger(HelloRepository.class);

			private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demojpaappdbpersistenceunit");
			private final EntityManager em = entityManagerFactory.createEntityManager();

//			/* Spring calls the methods annotated with @PostConstruct only once, just after the initialization of bean*/
//			@PostConstruct
//			public void initHelloRepository() {
//						LOG.info("++++++++++++  @PostConstruct");
//						entityManagerFactory = Persistence.createEntityManagerFactory("demojpaappdbpersistenceunit");
//						em = entityManagerFactory.createEntityManager();
//
//						LOG.info(">>>> entity < {} >Manager <<<<", em);
//			}
//
//			/* A method annotated with @PreDestroy runs only once, just before Spring removes our bean from the application context.*/
//			@PreDestroy
//			public void closeEntityManagerFactory() {
//						LOG.info("----------------- @PreDestroy");
//						em.close();
//						entityManagerFactory.close();
//			}

			@Override
			public Employee createEmployee(Employee employee) {
						LOG.info("helloRepository > createEmployee ");

						boolean successful = false;
						try {
									em.getTransaction().begin();
									em.persist(employee);
									em.getTransaction().commit();
									successful = true;
						} catch (Exception e) {
									LOG.error("createEmployee ERROR ", e);
									em.getTransaction().rollback();
						}
						return successful ? employee : null;
			}

			@Override
			public List<Employee> getAllEmployees() {
						LOG.info("helloRepository > getAllEmployees ");
						TypedQuery<Employee> namedQuery = em.createNamedQuery("GETALLEMPLOYEES", Employee.class);
						LOG.info("namedQuery is {} ", namedQuery);
						List<Employee> res = namedQuery.getResultList();
						LOG.info("res is {} ", res);
						return res;
			}

			@Override
			public Employee findEmployee(Long empId) {
						Employee e;
        /* e = (Employee) em.createQuery("select E from Employee E where E.id = : empId")
                  .setParameter("empId", empId)
                  .getSingleResult();
        * */
						e = em.find(Employee.class, empId);
						return e;
			}

			@Override
			public Employee updateEmployee(Long empId, Employee e) {
						LOG.info("helloRepository > updateEmployee ");
						return null;
			}

			@Override
			public Employee DeleteEmployee(Long empId) {
						LOG.info("helloRepository > DeleteEmployee ");
						return null;
			}
}
