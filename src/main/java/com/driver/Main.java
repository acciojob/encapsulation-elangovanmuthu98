package com.driver;

public class Main {
  public static void main(String[] args)
  {
    RWOnly rw=new RWOnly("Elangovan");
    rw.setter("Hi");
    System.out.println(rw.getter());
    // completed
  }
}
