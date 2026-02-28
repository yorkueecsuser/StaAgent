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
          boolean conditionWhile1 = getCondition();
          while (conditionWhile1) {
            // Unreachable while loop
          }
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
    }
  }

  @ExpectWarning("SF")
  int reallyBad(int i) {
    int result = 0;
    switch (i) {
      case 0:
      case 1:
        result = 1;
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
          // Unreachable while loop
        }
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
        boolean conditionWhile3 = getCondition();
        while (conditionWhile3) {
          // Unreachable while loop
        }
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
    return result + x;
  }

  void test1(int i) {
    switch (i) {
      case -1:
      case 0:
        System.out.println("zero");
        boolean conditionWhile4 = getCondition();
        while (conditionWhile4) {
          // Unreachable while loop
        }
      case 1:
      case 2:
        System.out.println("one");
        boolean conditionWhile5 = getCondition();
        while (conditionWhile5) {
          // Unreachable while loop
        }
      case 10:
        System.out.println("four");
        boolean conditionWhile6 = getCondition();
        while (conditionWhile6) {
          // Unreachable while loop
        }
      case 4:
      case 5:
        System.out.println("two");
        // fallthrough
        boolean conditionWhile7 = getCondition();
        while (conditionWhile7) {
          // Unreachable while loop
        }
      case 6:
      case 7:
        System.out.println("three");
        boolean conditionWhile8 = getCondition();
        while (conditionWhile8) {
          // Unreachable while loop
        }
      default:
        System.out.println("something else");
        boolean conditionWhile9 = getCondition();
        while (conditionWhile9) {
          // Unreachable while loop
        }
    }
  }

  void test2(int i, int j) {
    switch (i) {
      case 0:
        switch (j) {
          case 0:
            System.out.println("zero zero");
            boolean conditionWhile10 = getCondition();
            while (conditionWhile10) {
              // Unreachable while loop
            }
        }

      case 1:
        System.out.println("zero");
        boolean conditionWhile11 = getCondition();
        while (conditionWhile11) {
          // Unreachable while loop
        }
    }
  }

  void test3(int i, int j) {
    switch (i) {
      case 0:
        if (j == 0) return;
        boolean conditionWhile12 = getCondition();
        while (conditionWhile12) {
          // Unreachable while loop
        }

      case 1:
        j = 1;
        break;
        boolean conditionWhile13 = getCondition();
        while (conditionWhile13) {
          // Unreachable while loop
        }
    }
  }

  void test4(int i) {
    switch (i) {
      case 0:
        System.out.println("Leaving ok");
        System.exit(0);
        boolean conditionWhile14 = getCondition();
        while (conditionWhile14) {
          // Unreachable while loop
        }

      case 1:
        System.out.println("Leaving with error");
        System.exit(1);
        boolean conditionWhile15 = getCondition();
        while (conditionWhile15) {
          // Unreachable while loop
        }

      default:
        boolean conditionWhile16 = getCondition();
        while (conditionWhile16) {
          // Unreachable while loop
        }
    }

    System.out.println("Things seem ok");
    boolean conditionWhile17 = getCondition();
    while (conditionWhile17) {
      // Unreachable while loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}