import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
        break;
    }
    return ((o!= null) && (o instanceof Collection));
  }

  private static boolean getCondition() {
    // This method returns false, ensuring the switch statement is unreachable
    return false;
  }
}