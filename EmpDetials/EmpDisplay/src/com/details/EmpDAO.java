package com.details;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
    private final String SQL_GET_ALL_EMPLOYEE = "select employee_id,first_name,email,last_name,phone_number,hire_date,job_id,salary,commission_pct,manager_id,department_id from employees";
    private ConnectinManager connectinManager;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private List<Employee> listsEmps;
    private Employee emp;
    
    public EmpDAO() {

    }
    
    public List<Employee> getDetails() throws SQLException {
        
         connectinManager=ConnectinManager.getInstance();
         con=connectinManager.getConn();
         st=con.createStatement();
         rs=st.executeQuery(SQL_GET_ALL_EMPLOYEE);
         listsEmps = new ArrayList<>();
           while (rs.next()) {
                emp = new Employee();
                emp.setEmployeeId(rs.getInt("employee_id"));
                emp.setFirstName(rs.getString("FIRST_NAME"));
                emp.setLastName(rs.getString("last_name"));
                emp.setEmail(rs.getString("EMAIL"));
                emp.setDepartmentId(rs.getInt("department_id"));
                emp.sethDate(rs.getDate("hire_date"));
                emp.setJobId(rs.getString("job_id"));
                emp.setManagerId(rs.getInt("manager_id"));
                emp.setCommision(rs.getInt("commission_pct"));
                emp.setPhn(rs.getString("phone_number"));
                emp.setSalary(rs.getFloat("salary"));
                listsEmps.add(emp);

                }

                return listsEmps;
        
        
        
    }
    
}
