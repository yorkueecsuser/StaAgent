import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Unreachable for loop mutant
    for (int i = 0; false; i++) {
      // this code is unreachable
      System.out.println("This line is unreachable");
    }
  }
}