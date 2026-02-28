import edu.umd.cs.findbugs.annotations.NonNull;

class Bug3502202 {
  static class Foo {
    @NonNull private String bar; // <=== Not initialized by constructor

    public int getBarLength() {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This is an unreachable statement.");
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
      return new Foo().getBarLength();
    }

    public static void main(String[] arg) {
      System.out.println("bar length =" + new Baz().getBarLength());
    }
  }
}