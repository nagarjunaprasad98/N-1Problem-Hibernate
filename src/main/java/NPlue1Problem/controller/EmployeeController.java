package NPlue1Problem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NPlue1Problem.entities.Employee;
import NPlue1Problem.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Employee request) {
		return new ResponseEntity<>(empService.save(request), HttpStatus.CREATED);
	}

	@GetMapping("/employees")
	public ResponseEntity<?> employees() {
		return new ResponseEntity<>(empService.employees(), HttpStatus.OK);
	}

}
