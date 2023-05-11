package com.shyf.empinfobank.processor;

import com.shyf.empinfobank.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;


public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {
    private static final Logger log = LoggerFactory.getLogger(EmployeeItemProcessor.class);

    @Override
    public Employee process(Employee employee) throws Exception {

        log.info("processing user data.....{}", employee);

        Employee dbEmployee = new Employee();
        dbEmployee.setFirstName(employee.getFirstName());
        dbEmployee.setLastName(employee.getLastName());
        dbEmployee.setCode(employee.getCode());
        dbEmployee.setEmail(employee.getEmail());
        dbEmployee.setIp(employee.getIp());
        dbEmployee.setLocation(employee.getLocation());
        dbEmployee.setNumber(employee.getNumber());
        dbEmployee.setPhoneNumber(employee.getPhoneNumber());
        return dbEmployee;
    }

}