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

  // Mutated code
  public static String methodMutant(Object bObject) {
    if (bObject instanceof Alpha && bObject instanceof Betta) {
      // --- detects Bug in next line ---
      Alpha xAlpha = (Alpha) bObject;
      Betta yBetta = (Betta) bObject;
      return (xAlpha.alpha() + " " + yBetta.betta());
    } else {
      return ("not (alpha and betta)");
    }
  }

  public static class SimplyBettaMutant implements Betta {
    @Override
    public String betta() {
      return (null);
    }
  }

  public static void mainMutant(String[] cArguments) {
    System.out.println(methodMutant(new SimplyBettaMutant()));
  }
}