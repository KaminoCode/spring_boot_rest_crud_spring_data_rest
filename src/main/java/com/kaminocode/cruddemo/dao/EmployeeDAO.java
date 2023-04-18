package com.kaminocode.cruddemo.dao;

import com.kaminocode.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
