package NPlue1Problem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import NPlue1Problem.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	@EntityGraph(attributePaths = "addresses")
	List<Employee> findAll();

	@Query("select e from Employee e left join fetch e.addresses")
	List<Employee> findEmployeeWithAddress();

}
