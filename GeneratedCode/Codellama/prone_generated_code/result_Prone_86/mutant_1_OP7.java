import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    boolean condition = false;
    while(condition) {
      System.out.println("This is an unreachable code");
    }
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
  }
}