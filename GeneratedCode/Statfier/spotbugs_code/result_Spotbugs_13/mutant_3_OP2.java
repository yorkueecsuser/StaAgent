import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    int x = 5; // New local variable assignment
    int x = 5; // Duplicate of the above assignment
    return 42;
  }

  static class A extends LongNaming {
    int methodg() {
      return 17;
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {}
  }
}