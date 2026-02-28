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

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
          case 0:
            System.out.println("This is unreachable");
            break;
          case 1:
            // This case will always be executed
            break;
        }
      }

      private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
      }
    }
  }
}