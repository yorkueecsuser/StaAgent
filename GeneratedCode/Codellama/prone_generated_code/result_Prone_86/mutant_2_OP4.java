import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Unreachable if-else statement
    boolean isInstance = clazz.isInstance(Object.class);
    if (isInstance) {
      // unreachable code
      System.out.println("This code is unreachable.");
    } else {
      // reachable code
      System.out.println("This code is reachable.");
    }
  }
}