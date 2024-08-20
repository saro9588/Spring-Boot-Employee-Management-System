package com.saro.dev.ems.mapper;

import com.saro.dev.ems.dto.EmployeeDto;
import com.saro.dev.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto maptoEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee maptoEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
