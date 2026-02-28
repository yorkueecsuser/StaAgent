import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    String jxqfvtbn = "unusedVariable"; // Dead Store
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    int pqzjfnrw = 42; // Dead Store
    return ((o!= null) && (o instanceof Collection));
  }
}