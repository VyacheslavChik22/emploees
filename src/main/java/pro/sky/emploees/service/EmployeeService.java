package pro.sky.emploees.service;

import pro.sky.emploees.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee add(String firstName, String lastName, int department, double salary);

    Employee remove(String firstName, String lastName,int department,double salary);

    Employee find(String firstName, String lastName,int department,double salary);


    Employee findEmployeeWithMaxSalary(Integer departmentId);

    Employee findEmployeeWithMinSalary(Integer departmentId);

    Map<Integer, List<Employee>> getAllEmployees();

    Collection<Employee> findAll();

    Collection<Employee> findEmployeesFromDepartment(Integer departmentId);


}

