class ExclusiveTest {

  void linear(int x) {
    for (int i = 0; i < x; i++) {}
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition? 1 : 0) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void call_linear_exclusive_constant(int x) {
    linear(x);
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition? 1 : 0) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void call_linear_exclusive_linear(int x) {
    for (int i = 0; i < x; i++) {
      linear(i);
    }
    boolean unreachableCondition = getUnreachableCondition();
    switch(unreachableCondition? 1 : 0) {
      case 1:
        // Unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}