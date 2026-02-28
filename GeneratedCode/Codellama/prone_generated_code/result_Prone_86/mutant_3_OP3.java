import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Inserted unreachable if branch
    if (false) {
      System.out.println("This code is unreachable");
    }
  }
}