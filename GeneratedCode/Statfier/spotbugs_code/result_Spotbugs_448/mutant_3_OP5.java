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

      // Inserting unreachable switch statement
      boolean condition = getCondition();
      switch (condition) {
        case true:
          System.out.println("This is unreachable code");
          break;
        default:
          System.out.println("This is also unreachable code");
          break;
      }
    } else {
      return ("not (alpha and betta)");
    }
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

  // Method to provide a dynamic condition for the switch statement
  private static boolean getCondition() {
    return false;
  }
}