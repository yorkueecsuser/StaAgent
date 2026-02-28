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
          boolean conditionFor = getCondition();
          for (int j = 0; conditionFor; j++) { // Unreachable for loop
            // This loop is unreachable
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
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) { // Unreachable for loop
          // This loop is unreachable
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
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) { // Unreachable for loop
          // This loop is unreachable
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
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) { // Unreachable for loop
          // This loop is unreachable
        }
      case 1:
      case 2:
        System.out.println("one");
        boolean conditionFor2 = getCondition();
        for (int j = 0; conditionFor2; j++) { // Unreachable for loop
          // This loop is unreachable
        }
      case 10:
        System.out.println("four");
        boolean conditionFor3 = getCondition();
        for (int j = 0; conditionFor3; j++) { // Unreachable for loop
          // This loop is unreachable
        }
      case 4:
      case 5:
        System.out.println("two");
        // fallthrough
      case 6:
      case 7:
        System.out.println("three");
        boolean conditionFor4 = getCondition();
        for (int j = 0; conditionFor4; j++) { // Unreachable for loop
          // This loop is unreachable
        }
      default:
        System.out.println("something else");
        boolean conditionFor5 = getCondition();
        for (int j = 0; conditionFor5; j++) { // Unreachable for loop
          // This loop is unreachable
        }
    }
  }

  void test2(int i, int j) {
    switch (i) {
      case 0:
        switch (j) {
          case 0:
            System.out.println("zero zero");
            boolean conditionFor = getCondition();
            for (int k = 0; conditionFor; k++) { // Unreachable for loop
              // This loop is unreachable
            }
        }

      case 1:
        System.out.println("zero");
        boolean conditionFor2 = getCondition();
        for (int k = 0; conditionFor2; k++) { // Unreachable for loop
          // This loop is unreachable
        }
    }
  }

  void test3(int i, int j) {
    switch (i) {
      case 0:
        if (j == 0) return;
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) { // Unreachable for loop
          // This loop is unreachable
        }

      case 1:
        j = 1;
        break;
    }
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
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) { // Unreachable for loop
          // This loop is unreachable
        }
    }

    System.out.println("Things seem ok");
  }

  private boolean getCondition() {
    return false; // This method returns false, making the loops unreachable
  }
}