package com.lambdaschool.orders.model;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customercode;

    @Column(nullable = false)
    private String customername;

    private String custcity;
    private String workingarea;
    private String custcountry;
    private String grade;
    private double openingamt;
    private double receiveamt;
    private double paymentamt;
    private double outstandingamt;
    private String phone;

    @OneToMany
    @Column(nullable = false)
    private long agentcode;

    public Customers()
    {
    }

    public Customers(String customername, String custcity, String workingarea, String custcountry, String grade, double openingamt, double receiveamt, double paymentamt, double outstandingamt, String phone, long agentcode)
    {
        this.customername = customername;
        this.custcity = custcity;
        this.workingarea = workingarea;
        this.custcountry = custcountry;
        this.grade = grade;
        this.openingamt = openingamt;
        this.receiveamt = receiveamt;
        this.paymentamt = paymentamt;
        this.outstandingamt = outstandingamt;
        this.phone = phone;
        this.agentcode = agentcode;
    }

    public long getCustomercode()
    {
        return customercode;
    }

    public void setCustomercode(long customercode)
    {
        this.customercode = customercode;
    }

    public String getCustomername()
    {
        return customername;
    }

    public void setCustomername(String customername)
    {
        this.customername = customername;
    }

    public String getCustcity()
    {
        return custcity;
    }

    public void setCustcity(String custcity)
    {
        this.custcity = custcity;
    }

    public String getWorkingarea()
    {
        return workingarea;
    }

    public void setWorkingarea(String workingarea)
    {
        this.workingarea = workingarea;
    }

    public String getCustcountry()
    {
        return custcountry;
    }

    public void setCustcountry(String custcountry)
    {
        this.custcountry = custcountry;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public double getOpeningamt()
    {
        return openingamt;
    }

    public void setOpeningamt(double openingamt)
    {
        this.openingamt = openingamt;
    }

    public double getReceiveamt()
    {
        return receiveamt;
    }

    public void setReceiveamt(double receiveamt)
    {
        this.receiveamt = receiveamt;
    }

    public double getPaymentamt()
    {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt)
    {
        this.paymentamt = paymentamt;
    }

    public double getOutstandingamt()
    {
        return outstandingamt;
    }

    public void setOutstandingamt(double outstandingamt)
    {
        this.outstandingamt = outstandingamt;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public long getAgentcode()
    {
        return agentcode;
    }

    public void setAgentcode(long agentcode)
    {
        this.agentcode = agentcode;
    }
}
