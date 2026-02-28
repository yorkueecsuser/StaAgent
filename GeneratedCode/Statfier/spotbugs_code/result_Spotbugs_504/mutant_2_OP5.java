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
      // Unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          x = 4; // This will never be executed
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        result = 4; // This will never be executed
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        x = 2; // This will never be executed
        break;
    }
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("unreachable"); // This will never be executed
        break;
    }
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
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("unreachable"); // This will never be executed
        break;
    }
  }

  void test3(int i, int j) {
    switch (i) {
      case 0:
        if (j == 0) return;

      case 1:
        j = 1;
        break;
    }
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        j = 2; // This will never be executed
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
    }

    System.out.println("Things seem ok");
    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("unreachable"); // This will never be executed
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}