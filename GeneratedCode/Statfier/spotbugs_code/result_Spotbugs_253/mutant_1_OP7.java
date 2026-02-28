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

      // Inserted unreachable while loop
      boolean conditionWhile = getUnreachableCondition();
      while (conditionWhile) {
        // This loop is unreachable
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

      // Inserted unreachable while loop
      boolean conditionWhile = getUnreachableCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
    }

    boolean evaluate() {
      return true;
    }

    boolean getUnreachableCondition() {
      return false; // This method always returns false, making the loop unreachable
    }
  }
}