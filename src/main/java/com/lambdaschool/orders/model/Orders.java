package com.lambdaschool.orders.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordernum;

    private double ordamount;
    private double advancedamount;

    @Column(nullable = false)
    @OneToMany
    private long custcode;

    private String orderdescription;

    public Orders()
    {
    }

    public Orders(double ordamount, double advancedamount, long custcode, String orderdescription)
    {
        this.ordamount = ordamount;
        this.advancedamount = advancedamount;
        this.custcode = custcode;
        this.orderdescription = orderdescription;
    }

    public long getOrdernum()
    {
        return ordernum;
    }

    public void setOrdernum(long ordernum)
    {
        this.ordernum = ordernum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvancedamount()
    {
        return advancedamount;
    }

    public void setAdvancedamount(double advancedamount)
    {
        this.advancedamount = advancedamount;
    }

    public long getCustcode()
    {
        return custcode;
    }

    public void setCustcode(long custcode)
    {
        this.custcode = custcode;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription)
    {
        this.orderdescription = orderdescription;
    }
}
