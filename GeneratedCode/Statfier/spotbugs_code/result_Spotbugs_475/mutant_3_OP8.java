class Bug2137182 {
  static class Base {
    public String getName() {
      return "base";
    }
  }

  static class Outer {
    Inner inner = new Inner();

    public String getName() {
      return "Outer";
    }

    public String foo() {
      return "foo";
    }

    class Inner extends Base {
      public void falsePositive() {
        System.out.println(this.getName());
      }
    }
  }

  // Mutated code
  static class Outer2 {
    Inner2 inner2 = new Inner2();

    public String getName2() {
      return "Outer2";
    }

    public String foo2() {
      return "foo2";
    }

    class Inner2 extends Base {
      public void falsePositive2() {
        System.out.println(this.getName());
      }
    }
  }
}