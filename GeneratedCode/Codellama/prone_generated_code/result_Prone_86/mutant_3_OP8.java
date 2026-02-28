import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  }

  // Mutant 1: Renaming
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Renamed variable
    Class<Object> newClazz = Object.class;
    System.out.println(newClazz.isInstance(Object.class)); // prints "true"
  }
}