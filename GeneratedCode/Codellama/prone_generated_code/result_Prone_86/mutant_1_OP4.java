import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    boolean condition = getCondition();
    if (condition) {
      System.out.println(clazz.isInstance(Object.class)); // prints "true"
    } else {
      System.out.println("Never reached");
    }
  }
}

private boolean getCondition() {
  return false;
}