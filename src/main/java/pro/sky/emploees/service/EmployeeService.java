package pro.sky.emploees.service;

import pro.sky.emploees.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int department, double salary);

    Employee remove(String firstName, String lastName,int department,double salary);

    Employee find(String firstName, String lastName,int department,double salary);


    Employee findEmployeeWithMaxSalary(Integer departmentId);

    Employee findEmployeeWithMinSalary(Integer departmentId);

    Collection<Employee> findAll();

    Collection<Employee> findEmployeesFromDepartment(Integer departmentId);

    Collection<Employee> findAllEmployeeByDepartments(Integer departmentId);
}

