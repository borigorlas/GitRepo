package com.details;

import java.sql.SQLException;

import java.util.List;

public class EmpService {
    private EmpDAO dao;
    public EmpService() {
       
        dao=new EmpDAO();
    }
    
    public List<Employee> getEmplist() throws SQLException {
        
        
        return dao.getDetails();
        
    }
}
