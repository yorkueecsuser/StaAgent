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

      // Inserted unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
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

      // Inserted unreachable for loop
      boolean conditionFor = getConditionForLoop();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because conditionFor is always false
      }
    }

    boolean evaluate() {
      return true;
    }

    // Method to provide a dynamic but always false condition for the loop
    private boolean getConditionForLoop() {
      return false;
    }
  }
}