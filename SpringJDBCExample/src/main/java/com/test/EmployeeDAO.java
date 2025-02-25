package com.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
		  
	public int saveEmployee(Employee e){  
	    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getEmail()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getName()+"',email='"+e.getEmail()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	} 
	
	
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
}
