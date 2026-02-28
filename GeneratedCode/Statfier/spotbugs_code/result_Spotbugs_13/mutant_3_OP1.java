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
      intabcdefgh = 99; // Dead store
      return 43;
    }

    @ExpectWarning("Nm")
    int methodG() {
      return 18;
    }

    @ExpectWarning("Nm")
    void Wait() {
      String hijklmno = "unused"; // Dead store
    }
  }
}