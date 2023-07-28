package com.n16.qltv.model;

import java.util.Date;

public class Customer {
    private int idcus;
    private String nameCus, phoneCus;
    private String addressCus;
    private Date dobCus;
    private String usrName, password;

    public Customer() { }
    public Customer(String nameCus, String phoneCus, String addressCus, Date dobCus, String usrName, String password) {
        this.nameCus = nameCus;
        this.phoneCus = phoneCus;
        this.addressCus = addressCus;
        this.dobCus = dobCus;
        this.usrName = usrName;
        this.password = password;
    }

    public int getIdcus() { return this.idcus; }
    public String getNameCus() { return this.nameCus; }
    public String getPhoneCus() { return this.phoneCus; }
    public String getAddressCus() { return this.addressCus; }
    public Date getDobCus() { return this.dobCus; }
    public String getUsrName() { return this.usrName; }
    public String getPassword() { return this.password; }
    public void setNameCus(String nameCus) { this.nameCus = nameCus; }
    public void setPhoneCus(String phoneCus) { this.phoneCus = phoneCus; }
    public void setAddressCus(String addressCus) { this.addressCus = addressCus; }
    public void setDobCus(Date dobCus) { this.dobCus = dobCus; }
    public void setUsrName(String usrName) { this.usrName = usrName; }
    public void setPassword(String password) { this.password = password; }
}
