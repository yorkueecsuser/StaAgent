import java.util.Collection;

class DumbMethods {

  public static String getStringOfString(String s) {
    return s.toString();
  }

  public static boolean isCollection(Object o) {
    boolean result = (o!= null) && (o instanceof Collection);
    boolean result = (o!= null) && (o instanceof Collection); // Mutant: duplicated assignment statement
    return result;
  }
}