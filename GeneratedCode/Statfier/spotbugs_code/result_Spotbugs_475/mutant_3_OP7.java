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
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // This loop is unreachable because conditionWhile is always false
        }
        
        System.out.println(this.getName());
      }

      private boolean getCondition() {
        return false;
      }
    }
  }
}