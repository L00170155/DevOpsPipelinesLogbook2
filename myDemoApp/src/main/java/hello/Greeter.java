package hello;

 /**
 * Standard comment.
 */

public class Greeter {
  private String name = "";

  public String getName()

  {
    return name;
  }


  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Standard comment.
   * @return name or Hello
   */

  public String sayHello()
  {
    if (name == "")
    {
      return "Hello!";
    }
    else
    {
      return "Hello " + name + "!";
    }
  }

}