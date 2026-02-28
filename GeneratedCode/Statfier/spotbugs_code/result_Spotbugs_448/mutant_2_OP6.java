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
      
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor will always be false
      }
      
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

  // Method to provide a dynamic condition that will always be false
  private static boolean getCondition() {
    return false;
  }
}