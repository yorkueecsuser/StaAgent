class Bug2689238 {

  public interface Alpha {
    public String alpha();
  }

  public interface Betta {
    public String betta();
  }

  public static String method(Object aObject) {
    boolean condition = getCondition();
    if (condition) {
      switch (getValue()) {
        case 1:
          // Unreachable code
          System.out.println("This is an unreachable switch case.");
          break;
        default:
          // Do nothing
          break;
      }
    }

    if (aObject instanceof Alpha && aObject instanceof Betta) {
      // --- detects Bug in next line ---
      Alpha lAlpha = (Alpha) aObject;
      Betta lBetta = (Betta) aObject;
      return (lAlpha.alpha() + " " + lBetta.betta());
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

  private static boolean getCondition() {
    return false; // This ensures the switch statement is unreachable
  }

  private static int getValue() {
    return 0; // This ensures the switch case 1 is not taken
  }
}