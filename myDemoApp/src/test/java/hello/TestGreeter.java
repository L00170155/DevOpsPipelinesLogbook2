package hello;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestGreeter {
  private Greeter g;
  @BeforeSuite
  public void setUp() throws Exception
  {
    g = new Greeter();
  }


  @Test
  public void testGreeterEmpty() throws Exception {
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
  public void newtestWMGreeterPass() {
    g.setName("Boris");
    Assert.assertEquals(g.getName(),"Boris");
    Assert.assertEquals(g.sayHello(),"Hello Boris!");
  }

}