package couk.nucmedone.handsome_robot.server.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import couk.nucmedone.handsome_robot.shared.dto.EmployeeDTO;

@Repository("employeeDAO")
public class EmployeeDAO extends JpaDAO<Long, EmployeeDTO> {

 @Autowired
 EntityManagerFactory entityManagerFactory;

 @PostConstruct
 public void init() {
  super.setEntityManagerFactory(entityManagerFactory);
 }

}
