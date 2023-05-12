package com.driver;

public class RWOnly {
    private String name;
    RWOnly(String n)
    {
        this.name=n;
    }
    public void setter(String n)
    {
        this.name=n;
    }
    public String getter()
    {
        return name;
    }
}
