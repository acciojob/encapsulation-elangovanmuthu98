package com.driver;

public class Main {
  public static void main(String[] args)
  {
    RWOnly rw=new RWOnly();
    rw.setter("Elangovan");
    System.out.println(rw.getter());
    // completed
  }
}
