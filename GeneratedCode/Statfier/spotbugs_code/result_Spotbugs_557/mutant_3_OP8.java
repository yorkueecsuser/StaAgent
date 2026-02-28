import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    return s.toString();
  }

  // Mutated method with renamed variable
  public static boolean isCollection(Object o) {
    return ((o!= null) && (o instanceof Collection));
  }

  public static boolean isCollection(Object x) {
    return ((x!= null) && (x instanceof Collection));
  }
}