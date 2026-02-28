import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  }
}

// MUTANT 1
class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "false"
  }
}

// MUTANT 2
class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(String.class)); // prints "false"
  }
}

// MUTANT 3
class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Integer.class)); // prints "false"
  }
}

// MUTANT 4
class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Double.class)); // prints "false"
  }
}

// MUTANT 5
class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Boolean.class)); // prints "false"
  }
}