import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  }

  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Renaming user-defined variable 'clazz' to 'a'
    Class<Object> a = Object.class;
    System.out.println(a.isInstance(Object.class)); // prints "true"
  }
}