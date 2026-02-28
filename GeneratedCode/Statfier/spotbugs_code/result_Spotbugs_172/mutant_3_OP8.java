import edu.umd.cs.findbugs.annotations.NonNull;

class Bug3502202 {
  static class Foo {
    @NonNull private String bar; // <=== Not initialized by constructor

    public int getBarLength() {
      return bar.length();
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

  // Mutated code
  static class Qux {
    @NonNull private String baz; // <=== Not initialized by constructor

    public int getBazLength() {
      return baz.length();
    }

    public void setBaz(String baz) {
      this.baz = baz;
    }
  }

  static class Quux {
    public int getBazLength() {
      return new Qux().getBazLength();
    }

    public static void main(String[] xyz) {
      System.out.println("baz length =" + new Quux().getBazLength());
    }
  }
}