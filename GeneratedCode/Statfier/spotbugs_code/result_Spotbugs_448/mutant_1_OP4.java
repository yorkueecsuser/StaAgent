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

    // Inserting an unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because condition is always false
      return "unreachable if";
    } else {
      // This block is also unreachable because condition is always false
      return "unreachable else";
    }
  }

  private static boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
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