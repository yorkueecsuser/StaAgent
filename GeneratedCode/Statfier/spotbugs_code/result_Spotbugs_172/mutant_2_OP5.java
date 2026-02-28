import edu.umd.cs.findbugs.annotations.NonNull;

class Bug3502202 {
  static class Foo {
    @NonNull private String bar; // <=== Not initialized by constructor

    public int getBarLength() {
      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case.");
          break;
      }
      return bar.length();
    }

    private boolean getCondition() {
      return false;
    }

    public void setBar(String bar) {
      this.bar = bar;
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