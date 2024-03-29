package org.fac.test;


import org.springframework.beans.factory.config.AbstractFactoryBean;

class EmployeeFactoryBean extends AbstractFactoryBean
{
    private String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    //This method will be called by container to create new instances
    @Override
    protected Object createInstance() throws Exception
    {
        EmployeeDTO employee = new EmployeeDTO();
        employee.setId(-1);
        employee.setFirstName("dummy");
        employee.setLastName("dummy");
        //Set designation here
        employee.setDesignation(designation);
        return employee;
    }

    //This method is required for autowiring to work correctly
    @Override
    public Class<EmployeeDTO> getObjectType() {
        return EmployeeDTO.class;
    }
}