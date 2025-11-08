package br.com.GCprot.services;

import java.util.List;

import br.com.GCprot.entities.Employee;
import br.com.GCprot.entities.Person;
import br.com.GCprot.repository.EmployeeRepository;
import br.com.GCprot.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired; // Import necessário
import org.springframework.stereotype.Service; // Import necessário

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    public Employee updateEmployee(Employee employeeUpdate) {
        Employee employee = employeeRepository.findById(employeeUpdate.getId())
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para atualizar"));
        employee.setFunction(employeeUpdate.getFunction());
        employee.setDescription(employeeUpdate.getDescription());

        return employeeRepository.save(employee);
    }

    @Transactional
    public boolean deleteEmployee(int employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para deletar"));
        employeeRepository.delete(employee);
        return true;
    }

    public Employee readEmployee(int employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Erro ao encontrar usuário para ler"));
        return employee;
    }

    public List<Employee> readPersonAll() {
        return employeeRepository.findAll();
    }
}

