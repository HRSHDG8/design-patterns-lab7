package edu.sdsu.cs160.singleton;

public class SingletonDemo {
  private static SingletonDemo singletonDemo;

  private SingletonDemo() {
  }

  public static synchronized SingletonDemo getInstance() {
    if (singletonDemo == null) {
      singletonDemo = new SingletonDemo();
    }
    return singletonDemo;
  }

  private int counter = 0;

  public int increment(){
    return ++counter;
  }

  public int decrement(){
    return --counter;
  }

}
