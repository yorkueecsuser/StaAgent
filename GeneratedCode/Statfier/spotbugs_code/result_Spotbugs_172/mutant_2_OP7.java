import edu.umd.cs.findbugs.annotations.NonNull;

class Bug3502202 {
  static class Foo {
    @NonNull private String bar; // <=== Not initialized by constructor

    public int getBarLength() {
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() returns false
      }
      return bar.length();
    }

    public void setBar(String bar) {
      this.bar = bar;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  // Furthermore, the following 'getBarLenght()' method will throw a
  // NullPointerException because the 'bar' field is not initialised. This is
  // not detected either.

  static class Baz {
    public int getBarLength() {
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() returns false
      }
      return new Foo().getBarLength();
    }

    public static void main(String[] arg) {
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() returns false
      }
      System.out.println("bar length =" + new Baz().getBarLength());
    }

    private static boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}