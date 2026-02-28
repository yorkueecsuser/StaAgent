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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
      return "foo";
    }

    class Inner extends Base {
      public void falsePositive() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable while loop
        }
        System.out.println(this.getName());
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}