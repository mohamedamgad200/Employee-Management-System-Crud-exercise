package net_javaguides.ems.service;

import net_javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
    List<EmployeeDto>getAllEmployees();
    EmployeeDto updateEmployee(long employeeId,EmployeeDto updatedEmployee);
    void deleteEmployee(long employeeId);
}
