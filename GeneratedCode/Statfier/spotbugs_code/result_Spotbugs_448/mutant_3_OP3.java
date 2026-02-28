class Bug2689238 {

  public interface Alpha {
    public String alpha();
  }

  public interface Betta {
    public String betta();
  }

  public static String method(Object aObject) {
    if (aObject instanceof Alpha && aObject instanceof Betta) {
      // --- detects Bug in next line ---
      Alpha lAlpha = (Alpha) aObject;
      Betta lBetta = (Betta) aObject;
      return (lAlpha.alpha() + " " + lBetta.betta());
    } else {
      return ("not (alpha and betta)");
    }

    // Inserting unreachable if branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      System.out.println("This is an unreachable statement");
    }
  }

  private static boolean getUnreachableCondition() {
    return false;
  }

  public static class SimplyBetta implements Betta {
    @Override
    public String betta() {
      return (null);
    }
  }

  public static void main(String[] aArguments) {
    System.out.println(method(new SimplyBetta()));
  }
}