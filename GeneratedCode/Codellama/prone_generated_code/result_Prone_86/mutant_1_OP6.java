import java.util.*;

class IsInstanceOfClassBug {
  public static void main(String[] args) {
    Class<Object> clazz = Object.class;
    System.out.println(clazz.isInstance(Object.class)); // prints "true"

    // Mutant code
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // code to be executed
    }
  }

  private static boolean getCondition() {
    return false;
  }
}