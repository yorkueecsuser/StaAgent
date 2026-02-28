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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            // This case is unreachable because condition is never true
            System.out.println("This is an unreachable case");
            break;
          case 1:
            // This case is always executed
            System.out.println("This is the reachable case");
            break;
        }
      }

      private boolean getCondition() {
        return false;
      }
    }
  }
}