import edu.umd.cs.findbugs.annotations.NonNull;

class Bug3502202 {
  static class Foo {
    @NonNull private String bar; // <=== Not initialized by constructor

    public int getBarLength() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in getBarLength");
      } else {
        // Another unreachable code
        System.out.println("This is another unreachable code in getBarLength");
      }
      return bar.length();
    }

    public void setBar(String bar) {
      this.bar = bar;
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if-else branches unreachable
    }
  }

  // Furthermore, the following 'getBarLenght()' method will throw a
  // NullPointerException because the 'bar' field is not initialised. This is
  // not detected either.

  static class Baz {
    public int getBarLength() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some unreachable code
        System.out.println("This is unreachable code in getBarLength of Baz");
      } else {
        // Another unreachable code
        System.out.println("This is another unreachable code in getBarLength of Baz");
      }
      return new Foo().getBarLength();
    }

    public static void main(String[] arg) {
      System.out.println("bar length =" + new Baz().getBarLength());
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if-else branches unreachable
    }
  }
}