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

      // Added unreachable if statement
      boolean alwaysFalse = getAlwaysFalse();
      if (alwaysFalse) {
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

      // Added unreachable if statement
      boolean alwaysFalse = getAlwaysFalse();
      if (alwaysFalse) {
        System.out.println("This is another unreachable statement.");
      }
    }

    boolean evaluate() {
      return true;
    }

    boolean getAlwaysFalse() {
      return false;
    }
  }
}