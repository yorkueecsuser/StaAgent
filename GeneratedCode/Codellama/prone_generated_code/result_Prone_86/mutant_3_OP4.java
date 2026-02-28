import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Unreachable if-else statement mutant
    if (false) {
      System.out.println("This branch is unreachable.");
    } else {
      System.out.println("This branch is reachable.");
    }
  }
}