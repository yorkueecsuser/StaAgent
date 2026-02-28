import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"
    boolean conditionWhile = getConditionWhile();
    while (conditionWhile) {
      // This block is unreachable
      System.out.println("This block is unreachable");
    }
  }
  
  private static boolean getConditionWhile() {
    return false;
  }
}