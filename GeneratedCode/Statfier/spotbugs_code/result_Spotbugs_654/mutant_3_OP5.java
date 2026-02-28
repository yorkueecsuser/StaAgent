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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This will never be printed");
        break;
      default:
        // This is the default case
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}