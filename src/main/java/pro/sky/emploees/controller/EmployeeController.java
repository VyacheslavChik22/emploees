package pro.sky.emploees.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.emploees.Employee;
import pro.sky.emploees.service.EmployeeService;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department, @RequestParam double salary) {
        return service.add(firstName, lastName, department, salary);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department, @RequestParam double salary) {
        return service.remove(firstName, lastName, department, salary);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department, @RequestParam double salary) {
        return service.find(firstName, lastName, department, salary);
    }

    @GetMapping
    public Collection<Employee> findAll() {
        return service.findAll();
    }



    @GetMapping("/departments/max-salary")
    public Employee findEmployeeWithMaxSalary(@RequestParam Integer departmentId) {
        return service.findEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping("/departments/min-salary")
    public Employee findEmployeeWithMinSalary(@RequestParam Integer departmentId) {
        return service.findEmployeeWithMinSalary(departmentId);
    }


@GetMapping("/departments/all")
public Map<Integer, List<Employee>> getAll(){
        return service.getAllEmployees();
}

    @GetMapping("/departments/all-department")
    public Collection<Employee> findEmployeesFromDepartment(@RequestParam Integer departmentId) {
        return service.findEmployeesFromDepartment(departmentId);
    }


}





