package com.codeclan.relationshiplab.relationship;

import com.codeclan.relationshiplab.relationship.models.Department;
import com.codeclan.relationshiplab.relationship.models.Employee;
import com.codeclan.relationshiplab.relationship.models.Project;
import com.codeclan.relationshiplab.relationship.repositories.DepartmentRepository;
import com.codeclan.relationshiplab.relationship.repositories.EmployeeRepository;
import com.codeclan.relationshiplab.relationship.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void addEmployeeToDepartment(){
		Department department = new Department("Java");
		departmentRepository.save(department);
		Employee employee = new Employee("Louise", "oliver", 30,department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeeToProject(){
		Project project = new Project("Ruby", 14);
		projectRepository.save(project);
		Department department = new Department("Java");
		departmentRepository.save(department);
		Employee employee = new Employee("Louise", "oliver", 30,department);
		employeeRepository.save(employee);
		project.addEmployee(employee);
		projectRepository.save(project);
}




}
