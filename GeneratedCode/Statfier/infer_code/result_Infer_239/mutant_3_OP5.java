class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    boolean condition = getCondition();
    switch(condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}