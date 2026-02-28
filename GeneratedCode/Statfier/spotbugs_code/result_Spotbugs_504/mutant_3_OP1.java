import edu.umd.cs.findbugs.annotations.ExpectWarning;

class SwitchFallthrough {

  static class DeadStoreToField {
    int x;

    @ExpectWarning("SF")
    void deadStoreToField(int i) {
      switch (i) {
        case 0:
        case 1:
          x = 1;
        case 2:
        case 3:
          x = 2;
          break;
        case 4:
        case 5:
          x = 3;
          break;
        default:
          break;
      }
      // Mutant addition
      String qzvbnrht = "unused";
    }
  }

  @ExpectWarning("SF")
  int reallyBad(int i) {
    int result = 0;
    switch (i) {
      case 0:
      case 1:
        result = 1;
      case 2:
      case 3:
        result = 2;
        break;
      case 4:
      case 5:
        result = 3;
        break;
      default:
        break;
    }
    // Mutant addition
    int kxwvbnrj = 42;
    return result;
  }

  @ExpectWarning("SF")
  int notSoBad(int i) {
    int result = 0;
    int x = 0;
    switch (i) {
      case 0:
      case 1:
        result = 1;
        break;
      case 2:
        x = 1;
      case 3:
        result = 2;
        break;
      case 4:
      case 5:
        result = 3;
        break;
      default:
        break;
    }
    // Mutant addition
    boolean gkqzvbnr = true;
    return result + x;
  }

  void test1(int i) {
    switch (i) {
      case -1:
      case 0:
        System.out.println("zero");
      case 1:
      case 2:
        System.out.println("one");
      case 10:
        System.out.println("four");
      case 4:
      case 5:
        System.out.println("two");
        // fallthrough
      case 6:
      case 7:
        System.out.println("three");
      default:
        System.out.println("something else");
    }
    // Mutant addition
    double vbnrqzkg = 3.14;
  }

  void test2(int i, int j) {
    switch (i) {
      case 0:
        switch (j) {
          case 0:
            System.out.println("zero zero");
        }

      case 1:
        System.out.println("zero");
    }
    // Mutant addition
    char zqvbnrht = 'a';
  }

  void test3(int i, int j) {
    switch (i) {
      case 0:
        if (j == 0) return;

      case 1:
        j = 1;
        break;
    }
    // Mutant addition
    float jvbnrqzk = 2.71f;
  }

  void test4(int i) {
    switch (i) {
      case 0:
        System.out.println("Leaving ok");
        System.exit(0);

      case 1:
        System.out.println("Leaving with error");
        System.exit(1);

      default:
        // Mutant addition
        long bqzvbnrk = 100L;
    }

    System.out.println("Things seem ok");
  }
}