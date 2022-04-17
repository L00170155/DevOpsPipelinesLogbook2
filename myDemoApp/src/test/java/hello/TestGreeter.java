package hello;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestGreeter {
  private Greeter g;
  @BeforeSuite
  public void setUp() {
    g = new Greeter();
  }


  @Test
  public void testGreeterEmpty() {
    setUp();
    Assert.assertEquals(g.getName(),"");
    Assert.assertEquals(g.sayHello(),"Hello!");
  }

  @Test
  public void testGreeter()
  {
    g.setName("World");
    Assert.assertEquals(g.getName(),"World");
    Assert.assertEquals(g.sayHello(),"Hello World!");
  }

  @Test
  public void testGreeterNotBrian() {
    g.setName("NotBrian");
    Assert.assertNotEquals(g.getName(),"Brian");
    Assert.assertNotEquals(g.sayHello(),"Hello Brian!");
  }

}