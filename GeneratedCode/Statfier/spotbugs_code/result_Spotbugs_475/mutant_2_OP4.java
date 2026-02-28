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

        // Mutant: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
          System.out.println("This will never be printed");
        } else {
          System.out.println("This will also never be printed");
        }
      }

      private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
      }
    }
  }
}