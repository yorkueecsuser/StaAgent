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
        System.out.println("This will never be printed");
      } else {
        System.out.println("This will also never be printed");
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
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This will never be printed in testLoop");
      } else {
        System.out.println("This will also never be printed in testLoop");
      }
    }

    boolean evaluate() {
      return true;
    }

    boolean getUnreachableCondition() {
      return false; // This method always returns false, but it's not a compile-time constant
    }
  }
}