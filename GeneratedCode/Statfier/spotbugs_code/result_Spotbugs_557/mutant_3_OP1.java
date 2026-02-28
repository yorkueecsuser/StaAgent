import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    String qwejrtyp = "unusedVariable"; // Dead Store
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    int vbnmhtyu = 42; // Dead Store
    return ((o!= null) && (o instanceof Collection));
  }
}