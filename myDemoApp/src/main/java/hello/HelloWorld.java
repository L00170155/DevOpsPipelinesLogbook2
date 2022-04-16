package hello;

/**
 * Returns an Image object that can then be painted on the screen.
 * The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
 * argument is a specifier that is relative to the url argument.
 * <p>
 * This method always returns immediately, whether or not the
 * image exists. When this applet attempts to draw the image on
 * the screen, the data will be loaded. The graphics primitives
 * that draw the image will incrementally paint on the screen.
 *
 */

import java.time.LocalDateTime;

public class HelloWorld {
  /**
   * Returns an Image object that can then be painted on the screen.
   * argument is a specifier that is relative to the url argument.
   * This method always returns immediately, whether or not the
   * image exists. When this applet attempts to draw the image on
   * the screen, the data will be loaded. The graphics primitives
   * that draw the image will incrementally paint on the screen.
   *
   */

  public static void main(String[] args) {
    LocalDateTime currentTime = LocalDateTime.now();;
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}