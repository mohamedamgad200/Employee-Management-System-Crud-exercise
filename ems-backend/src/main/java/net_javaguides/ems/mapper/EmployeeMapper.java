package net_javaguides.ems.mapper;

import net_javaguides.ems.dto.EmployeeDto;
import net_javaguides.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(),
                employee.getFisrtName(),
                employee.getSecondName(),
                employee.getEmail());
    }

    public static Employee mapToEmployee(EmployeeDto employee) {
        return new Employee(employee.getId(),
                employee.getFirstName(),
                employee.getSecondName(),
                employee.getEmail());
    }

}
