package edu.sdsu.cs160.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonDemoTest {

  @Test
  public void showSingleTon(){
    SingletonDemo singletonDemo = SingletonDemo.getInstance();
    assertEquals(1, singletonDemo.increment());
  }

  @Test
  public void showItStillHasTheSameCounter(){
    SingletonDemo singletonDemo = SingletonDemo.getInstance();
    assertEquals(2, singletonDemo.increment());
  }

}
