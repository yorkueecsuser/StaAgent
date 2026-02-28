import edu.umd.cs.findbugs.annotations.ExpectWarning;

class LongNaming {
  int methodf() {
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

  // Mutated code
  int x() {
    return 42;
  }

  static class C extends LongNaming {
    int y() {
      return 17;
    }
  }

  static class D extends C {
    @ExpectWarning("Nm")
    int z() {
      return 43;
    }

    @ExpectWarning("Nm")
    int w() {
      return 18;
    }

    @ExpectWarning("Nm")
    void v() {}
  }
}