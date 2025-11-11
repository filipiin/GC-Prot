package br.com.GCprot.controller;

import br.com.GCprot.entities.Employee;
import br.com.GCprot.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> readEmployeeAll() {
        return new ResponseEntity<>(employeeService.readEmployeeAll(), HttpStatus.OK); // OK (200)
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> readEmployee(@PathVariable int id) {
        return new ResponseEntity<>(employeeService.readEmployee(id), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteEmployee(@PathVariable int id) {
        return new ResponseEntity<>(employeeService.deleteEmployee(id),HttpStatus.NO_CONTENT);
    }
}
