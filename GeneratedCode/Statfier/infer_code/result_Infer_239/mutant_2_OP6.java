class MathTest {

  void min_constant(int arr[]) {
    for (int i = 0; i < Math.min(3, arr.length); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void max_symbolic(int arr[]) {
    for (int i = 0; i < Math.max(0, arr.length); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void max2_symbolic(int x, int y) {
    for (int i = 0; i < Math.max(x, y); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_max2_constant() {
    max2_symbolic(10, 20);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void linear(int p) {
    for (int count = 0; count < p; count++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_with_min_constant() {
    linear(Math.min(3, 10));
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_with_max_linear(int x) {
    linear(Math.max(1, x));
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  private boolean getCondition() {
    return false;
  }
}