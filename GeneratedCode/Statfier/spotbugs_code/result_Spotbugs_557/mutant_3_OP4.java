import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in getStringOfString");
    }
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in isCollection");
    }
    return ((o!= null) && (o instanceof Collection));
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}