class Naming {
  public static class NamingException {
    // Should produce a warning
  }

  public static class NamingBaseException extends Exception {
    // Should not produce a warning
    private static final long serialVersionUID = 1L;
  }

  public static class NamingBaseChildException extends NamingBaseException {
    // Should not produce a warning
    private static final long serialVersionUID = 2L;
  }

  public static class TrickyName extends NamingBaseChildException {
    // Not a candidate - name doesn't imply it's an exception
    private static final long serialVersionUID = 3L;
  }

  public static class FinalException extends TrickyName {
    // Should not produce a warning
    private static final long serialVersionUID = 4L;
  }

  public static void main(String args[]) throws FinalException {
    boolean blah = true;
    if (blah) {
      throw new FinalException();
    }

    // Mutant code: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      // This branch is unreachable because getCondition() always returns false
      System.out.println("This is unreachable code.");
    }
  }

  // Method to provide a dynamic condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}