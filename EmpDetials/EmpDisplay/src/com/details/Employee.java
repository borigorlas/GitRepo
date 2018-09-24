package com.details;

import java.util.Date;

public class Employee {
    private int employeeId;

            private String firstName;
            private String lastName;
            private String phn;
            private String email;
            private Date hDate;
            private float salary;
            private String jobId;
            private int commision;
            private int departmentId;
            private int managerId;
	    private int Contact;

            public Employee() {
            }
	    
	    public int getContact() {
                    return Contact;
            }

            public void setContact(int Contact) {
                    this.Contact = Contact;
            }
            public int getEmployeeId() {
                    return employeeId;
            }

            public void setEmployeeId(int employeeId) {
                    this.employeeId = employeeId;
            }

            public String getFirstName() {
                    return firstName;
            }

            public void setFirstName(String firstName) {
                    this.firstName = firstName;
            }

            public String getLastName() {
                    return lastName;
            }

            public void setLastName(String lastName) {
                    this.lastName = lastName;
            }

            public String getPhn() {
                    return phn;
            }

            public void setPhn(String phn) {
                    this.phn = phn;
            }

            public String getEmail() {
                    return email;
            }

            public void setEmail(String email) {
                    this.email = email;
            }

            public Date gethDate() {
                    return hDate;
            }

            public void sethDate(Date hDate) {
                    this.hDate = hDate;
            }

            public float getSalary() {
                    return salary;
            }

            public void setSalary(float salary) {
                    this.salary = salary;
            }

            public String getJobId() {
                    return jobId;
            }

            public void setJobId(String jobId) {
                    this.jobId = jobId;
            }

            public int getCommision() {
                    return commision;
            }

            public void setCommision(int commision) {
                    this.commision = commision;
            }

            public int getDepartmentId() {
                    return departmentId;
            }

            public void setDepartmentId(int departmentId) {
                    this.departmentId = departmentId;
            }

            public int getManagerId() {
                    return managerId;
            }

            public void setManagerId(int managerId) {
                    this.managerId = managerId;
            }


}
