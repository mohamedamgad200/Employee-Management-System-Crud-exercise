package net_javaguides.ems.service.impl;

import lombok.AllArgsConstructor;
import net_javaguides.ems.dto.EmployeeDto;
import net_javaguides.ems.entity.Employee;
import net_javaguides.ems.exception.ResourceNotFoundException;
import net_javaguides.ems.mapper.EmployeeMapper;
import net_javaguides.ems.repository.EmployeeRepository;
import net_javaguides.ems.service.EmployeeService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee save=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(save);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId).orElseThrow(
                ()->new ResourceNotFoundException("Employee is not exists with given id :"+employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee>employees=employeeRepository.findAll();
        return employees.stream().map(
                (employee)->EmployeeMapper.mapToEmployeeDto(employee)).toList();
    }

    @Override
    public EmployeeDto updateEmployee(long employeeId, EmployeeDto updatedEmployee) {
        Employee employee=employeeRepository.findById(employeeId).orElseThrow(
                ()->new ResourceNotFoundException("Employee is not exists with given id :"+employeeId));
        employee.setFisrtName(updatedEmployee.getFirstName());
        employee.setSecondName(updatedEmployee.getSecondName());
        employee.setEmail(updatedEmployee.getEmail());
        Employee updatedEmployeeobject=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployeeobject);
    }

    @Override
    public void deleteEmployee(long employeeId) {
        Employee employee=employeeRepository.findById(employeeId).orElseThrow(
                ()->new ResourceNotFoundException("Employee is not exists with given id :"+employeeId));
        employeeRepository.delete(employee);
    }

}
