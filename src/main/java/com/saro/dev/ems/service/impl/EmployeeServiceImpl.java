package com.saro.dev.ems.service.impl;

import com.saro.dev.ems.dto.EmployeeDto;
import com.saro.dev.ems.entity.Employee;
import com.saro.dev.ems.mapper.EmployeeMapper;
import com.saro.dev.ems.repository.EmployeeRepository;
import com.saro.dev.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }
}
