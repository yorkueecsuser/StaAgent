import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    return 42;
    return 42; // Duplicate of the return statement
  }

  static class A extends LongNaming {
    int methodg() {
      return 17;
      return 17; // Duplicate of the return statement
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      return 43;
      return 43; // Duplicate of the return statement
    }

    @ExpectWarning("Nm")
    int methodG() {
      return 18;
      return 18; // Duplicate of the return statement
    }

    @ExpectWarning("Nm")
    void Wait() {}
  }
}