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

      // Mutant: Unreachable if statement
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This is an unreachable statement.");
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

      // Mutant: Unreachable if statement
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        System.out.println("This is another unreachable statement.");
      }
    }

    boolean evaluate() {
      return true;
    }

    // Method to provide a dynamically determined false condition
    boolean getUnreachableCondition() {
      return false;
    }
  }
}