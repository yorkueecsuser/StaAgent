import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
    return ((o!= null) && (o instanceof Collection));
  }

  private static boolean getCondition() {
    return false;
  }
}