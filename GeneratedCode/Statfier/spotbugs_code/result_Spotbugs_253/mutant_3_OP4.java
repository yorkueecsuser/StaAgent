import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3073124 {

  void methodA() {}

  void methodB() {}

  void testLoop(String b) {}

  static class Derived extends Bug3073124 {
    boolean condition;

    @Override
    @ExpectWarning("IL_INFINITE_RECURSIVE_LOOP")
    void methodA() {

      if (condition) {
        methodA();
      }

      // Introduced unreachable if-else statement
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This is unreachable code.");
      } else {
        System.out.println("This is also unreachable code.");
      }
    }

    // Corrected code
    @Override
    @NoWarning("IL_INFINITE_RECURSIVE_LOOP")
    void methodB() {

      if (condition) {
        super.methodB();
      }
    }

    @Override
    void testLoop(String b) {
      boolean test = evaluate();
      if (test) {
        testLoop("dfdsfsd");
      } else {
        super.testLoop("dsdsd");
      }

      // Introduced unreachable if-else statement
      boolean anotherUnreachableCondition = getAnotherUnreachableCondition();
      if (anotherUnreachableCondition) {
        System.out.println("More unreachable code.");
      } else {
        System.out.println("Even more unreachable code.");
      }
    }

    boolean evaluate() {
      return true;
    }

    // Method to provide a dynamically determined condition that is always false
    private boolean getUnreachableCondition() {
      return false;
    }

    // Another method to provide a dynamically determined condition that is always false
    private boolean getAnotherUnreachableCondition() {
      return false;
    }
  }
}