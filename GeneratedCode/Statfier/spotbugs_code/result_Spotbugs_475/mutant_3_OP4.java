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

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This is reachable");
        } else {
          System.out.println("This is unreachable");
        }
      }

      private boolean getCondition() {
        return true; // Always returns true to ensure the if block is reachable
      }
    }
  }
}