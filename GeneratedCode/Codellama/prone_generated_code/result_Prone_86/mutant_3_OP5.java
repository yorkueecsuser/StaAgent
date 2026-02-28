import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Unreachable switch statement
    int value = getValue();
    switch (value) {
      case 1:
        // code
        break;
      case 2:
        // code
        break;
      default:
        // code
        break;
    }
  }

  private static int getValue() {
    return 0;
  }
}