class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    boolean conditionIf = getCondition();
    if (conditionIf) { /* unreachable if block */ }
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    boolean conditionSwitch = getCondition();
    switch(conditionSwitch? 1 : 0) { 
      case 1: /* unreachable case block */ break;
    }
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable while loop */ }
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* unreachable for loop */ }
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    boolean conditionIf = getCondition();
    if (conditionIf) { /* unreachable if block */ }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined at runtime but always returns false
  }
}