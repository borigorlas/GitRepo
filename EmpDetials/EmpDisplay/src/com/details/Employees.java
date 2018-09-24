package com.details;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Employees {
    
    //private List<Employee> listOfEmps=new ArrayList<Employee>();
    private EmpService empService;
    
    public Employees() {
        super();
        empService=new EmpService();
        
    }

   
    
    public List<Employee> getListOfEmps() throws SQLException {
        
        return empService.getEmplist();
    }


}
