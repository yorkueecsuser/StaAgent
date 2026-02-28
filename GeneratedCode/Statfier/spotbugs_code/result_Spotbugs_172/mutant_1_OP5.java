import edu.umd.cs.findbugs.annotations.NonNull;

class Bug3502202 {
  static class Foo {
    @NonNull private String bar; // <=== Not initialized by constructor

    public int getBarLength() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This is the reachable case
          break;
      }
      return bar.length();
    }

    public void setBar(String bar) {
      this.bar = bar;
    }

    private boolean getCondition() {
      return false;
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