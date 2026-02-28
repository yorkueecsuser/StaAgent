import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    //Mutant code:
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("Unreachable code");
    } else {
      System.out.println("Reachable code");
    }
  }

  //Helper method to provide condition for if statement
  private static boolean getCondition() {
    return false;
  }
}