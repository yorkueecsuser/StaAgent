import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    return s.toString();
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case
        break;
    }
  }

  public static boolean isCollection(Object o) {
    return ((o!= null) && (o instanceof Collection));
    
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case
        break;
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch condition always evaluate to 1
    return false;
  }
}