package com.springBoot.pojo;

public class User {
    private String uid;
    private String name;
    private String pwd;
    private double hosts;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getHosts() {
        return hosts;
    }

    public void setHosts(double hosts) {
        this.hosts = hosts;
    }
}
