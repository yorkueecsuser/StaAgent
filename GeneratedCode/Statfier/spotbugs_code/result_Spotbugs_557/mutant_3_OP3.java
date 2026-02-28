import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable statement.");
    }
    return ((o!= null) && (o instanceof Collection));
  }

  private static boolean getCondition() {
    // This method returns false, making the if blocks unreachable
    return false;
  }
}