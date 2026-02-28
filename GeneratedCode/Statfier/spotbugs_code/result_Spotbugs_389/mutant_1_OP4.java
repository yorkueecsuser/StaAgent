import java.util.Date;

class Bug1817381 {

  static boolean comparison(Object a, Object b) {
    if (a == b) {
      return true;
    }

    if (a == null && b!= null) {
      return false;
    }

    if (a!= null && b == null) {
      return false;
    }

    // Findbugs reports
    return a.equals(b);
  }

  public static void main(String[] args) {
    Date a1 = new Date();
    Date a2 = new Date(a1.getTime());
    Date b = new Date(a1.getTime() + 100000);
    System.out.println("a1 == a2 : " + (a1 == a2));
    System.out.println("a1,a1 : " + comparison(a1, a1));
    System.out.println("a1,a2 : " + comparison(a1, a2));
    System.out.println("a1,b : " + comparison(a1, b));
    System.out.println("a1,null : " + comparison(a1, null));
    System.out.println("null,a2 : " + comparison(null, a2));
    System.out.println("null,null : " + comparison(null, null));

    // Unreachable if-else statement mutant
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }

    System.out.println("Done, no NPEs");
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}