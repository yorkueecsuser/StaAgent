import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    String jxqfvtbn = "unused"; // Dead store
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    int kpmzldnr = 42; // Dead store
    return ((o!= null) && (o instanceof Collection));
  }
}