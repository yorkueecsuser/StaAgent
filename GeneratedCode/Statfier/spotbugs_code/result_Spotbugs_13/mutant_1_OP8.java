import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
    return 42;
  }

  // Mutated method name from methodf to a
  int a() {
    return 42;
  }

  static class A extends LongNaming {
    int methodg() {
      return 17;
    }

    // Mutated method name from methodg to b
    int b() {
      return 17;
    }
  }

  static class B extends A {
    @ExpectWarning("Nm")
    int methodF() {
      return 43;
    }

    // Mutated method name from methodF to c
    int c() {
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      return 18;
    }

    // Mutated method name from methodG to d
    int d() {
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {}

    // Mutated method name from Wait to e
    void e() {}
  }
}