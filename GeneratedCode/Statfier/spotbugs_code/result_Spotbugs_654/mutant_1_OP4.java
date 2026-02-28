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

    // Inserted mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true.");
    } else {
      // This branch is unreachable because shouldRun is always false in this context
      System.out.println("This is an unreachable branch.");
    }
  }

  // Method to simulate a dynamic condition
  private static boolean getCondition() {
    return false; // This ensures the else branch is theoretically unreachable
  }
}