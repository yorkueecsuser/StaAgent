import java.io.IOException;

class Bug1964520 extends Exception {
  private static final long serialVersionUID = 1L;

  public void test(Exception e) {
    // should trigger warning (and does)
    if (((Bug1964520) e).toString().equals("")) {
      System.out.println("toString is blank");
      System.out.println("toString is blank"); // Mutant: Duplicate of the previous print statement
    }
    // should trigger warning (and does)
    if (e instanceof IOException && ((Bug1964520) e).toString().equals("")) {
      System.out.println("toString is blank");
      System.out.println("toString is blank"); // Mutant: Duplicate of the previous print statement
    }
    // should not trigger warning (and doesn't)
    if (e instanceof Bug1964520 && ((Bug1964520) e).toString().equals("")) {
      System.out.println("toString is blank");
      System.out.println("toString is blank"); // Mutant: Duplicate of the previous print statement
    }
    // should not trigger warning (and doesn't)
    if (e instanceof Bug1964520) {
      if (((Bug1964520) e).toString().equals("")) {
        System.out.println("toString is blank");
        System.out.println("toString is blank"); // Mutant: Duplicate of the previous print statement
      }
    }
  }
}