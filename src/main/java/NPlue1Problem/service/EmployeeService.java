package NPlue1Problem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NPlue1Problem.entities.Employee;
import NPlue1Problem.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo emprepo;

	public Employee save(Employee request) {
		return emprepo.save(request);
	}

	public List<Employee> employees() {
		return emprepo.findEmployeeWithAddress();
	}

}
