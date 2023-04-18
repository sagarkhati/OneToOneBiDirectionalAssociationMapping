package com.ssk.OneToOneBiDirectionalAssociationMapping.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssk.OneToOneBiDirectionalAssociationMapping.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
