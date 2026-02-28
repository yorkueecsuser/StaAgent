import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  }
}

// Duplication
class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    Class<Object> clazz1 = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  }
}