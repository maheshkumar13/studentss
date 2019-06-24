package scaits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import scaits.bo.employee.EmployeeBO;


public interface EmployeeRepository extends JpaRepository<EmployeeBO, Long> {
	List<EmployeeBO> findByEmployeeId(List<Long> employeeId);
	EmployeeBO findByPayRollId(String userName);
	
	EmployeeBO findByPayRollIdAndStatus(String userName,String status);

	EmployeeBO findByPayRollIdAndPassWordAndStatus(String username, String password, String string);
	
	List<EmployeeBO> findByStatus(String status);


	

}
