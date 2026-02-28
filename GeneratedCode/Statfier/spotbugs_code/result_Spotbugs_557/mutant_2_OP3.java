import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    // Inserting an unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable
      System.out.println("This is an unreachable statement.");
    }
    return ((o!= null) && (o instanceof Collection));
  }

  // Method to provide a dynamically determined false condition
  private static boolean getUnreachableCondition() {
    return false;
  }
}