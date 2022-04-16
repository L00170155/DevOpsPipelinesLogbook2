package hello;

 /**
 * Standard comment.
 */

public class Greeter {
  private String name = "";

  /**
   * Standard comment.
   * @return name
  */
  public String getName()
  {
    return name;
  }

  /**
   * Standard comment.
   * @param name name
  */

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
    if (name.equals(""))
    {
      return "Hello!";
    }
    else
    {
      return "Hello " + name + "!";
    }
  }

}