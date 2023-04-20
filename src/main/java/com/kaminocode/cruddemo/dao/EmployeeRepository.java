package com.kaminocode.cruddemo.dao;

import com.kaminocode.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it...no need to write any code
}
