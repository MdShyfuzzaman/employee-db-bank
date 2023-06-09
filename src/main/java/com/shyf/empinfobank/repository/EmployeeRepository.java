package com.shyf.empinfobank.repository;

import com.shyf.empinfobank.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
}