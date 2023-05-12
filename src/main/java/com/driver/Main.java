package com.driver;

public class Main {
  public static void main()
  {
    RWOnly rw=new RWOnly();
    rw.setter("Elangovan");
    String name=rw.getter();
    // completed
  }
}
