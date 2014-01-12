package couk.nucmedone.handsome_robot.shared.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import couk.nucmedone.handsome_robot.shared.dto.EmployeeDTO;

@RemoteServiceRelativePath("springGwtServices/employeeService")
public interface EmployeeService extends RemoteService {
	
	 public EmployeeDTO findEmployee(long employeeId);
	 public void saveEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception;
	 public void updateEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception;
	 public void saveOrUpdateEmployee(long employeeId, String name, String surname, String jobDescription) throws Exception;
	 public void deleteEmployee(long employeeId) throws Exception;

}