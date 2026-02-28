import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
    return ((o!= null) && (o instanceof Collection));
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always false
    return false;
  }
}