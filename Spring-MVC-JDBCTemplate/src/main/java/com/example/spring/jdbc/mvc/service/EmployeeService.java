package com.example.spring.jdbc.mvc.service;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.jdbc.mvc.bean.EmployeeBean;
import com.example.spring.jdbc.mvc.dao.EmployeeDAO;
import com.example.spring.jdbc.mvc.dto.EmployeeDTO;

public class EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public List<EmployeeDTO> getAllEmployeeRecord(){
		
		List<EmployeeBean> employeeBeansList = employeeDAO.retriveAllEmployee();
		
		List<EmployeeDTO> employeeDTOsList = new ArrayList<EmployeeDTO>();
		
		for(EmployeeBean employeeList : employeeBeansList) {
			
			EmployeeDTO dto = new EmployeeDTO(employeeList.getEmployee_id(),
											  employeeList.getEmployee_name(),
											  employeeList.getEmploye_job(),
											  employeeList.getEmployee_salary());
			employeeDTOsList.add(dto);
		}
		
		return employeeDTOsList;
		
	}
	
	public List<EmployeeDTO> getIdNameEmployeeRecord(){
		List<EmployeeBean> employeeBeanList=employeeDAO.retriveIdNameEmployee();
		List<EmployeeDTO> employeeDTOsList =new ArrayList<EmployeeDTO>();
		
		for(EmployeeBean idname_list:employeeBeanList) {
			EmployeeDTO dto=new EmployeeDTO(idname_list.getEmployee_id(),
											idname_list.getEmployee_name());
			
			employeeDTOsList.add(dto);
			
		}
		return employeeDTOsList;
	}
	
	public List<EmployeeDTO> getJobSalaryEmployeeRecord(){
		List<EmployeeBean> employeeBeanList=employeeDAO.retriveJobSalaryEmployee();
		List<EmployeeDTO> employeeDTOsList =new ArrayList<EmployeeDTO>();
		
		for(EmployeeBean jobsal_list:employeeBeanList) {
			EmployeeDTO dto=new EmployeeDTO(jobsal_list.getEmploye_job(),
					jobsal_list.getEmployee_salary());
			
			employeeDTOsList.add(dto);
			
		}
		return employeeDTOsList;
	}

	public List<EmployeeDTO> getIDSalaryEmployeeRecord(){
		List<EmployeeBean> employeeBeanList=employeeDAO.retriveIDSalaryEmpoyee();
		List<EmployeeDTO> employeeDTOsList =new ArrayList<EmployeeDTO>();
		
		for(EmployeeBean idsal_list:employeeBeanList) {
			EmployeeDTO dto=new EmployeeDTO(idsal_list.getEmployee_id(),
					idsal_list.getEmployee_salary());
			
			employeeDTOsList.add(dto);
			
		}
		return employeeDTOsList;
	}
	
	public List<EmployeeDTO> getIdJobSalaryEmployeeRecord(){
		List<EmployeeBean> employeeBeanList=employeeDAO.retriveIDJobSalaryEmpoyee();
		List<EmployeeDTO> employeeDTOsList =new ArrayList<EmployeeDTO>();
		
		for(EmployeeBean idjobsal_list:employeeBeanList) {
			EmployeeDTO dto2=new EmployeeDTO(idjobsal_list.getEmployee_id(),
					idjobsal_list.getEmploye_job(),
					idjobsal_list.getEmployee_salary());
			
			
			employeeDTOsList.add(dto2);
			//System.out.println("salary:: "+idjobsal_list.getEmployee_salary());
		}
		return employeeDTOsList;
	}
	
}
