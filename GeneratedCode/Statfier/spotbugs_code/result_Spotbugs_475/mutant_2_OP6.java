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

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
          // This loop is unreachable because conditionFor is dynamically determined to be false
        }
      }

      private boolean getCondition() {
        return false;
      }
    }
  }
}