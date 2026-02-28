import com.facebook.infer.annotation.*;

class InfiniteExecutionTime {
  static void square_root_FP(int x) {
    int i = 0;
    while (i * i < x) {
      i++;
    }
    // BUG: INFINITE_EXECUTION_TIME
  }

  static void loop_over_charArray_FP(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {
      // BUG: INFINITE_EXECUTION_TIME
    }
  }

  @Lockless
  static void call_top_cost_FP() {
    square_root_FP(1); // square_root_FP has Top cost
    // BUG: INFINITE_EXECUTION_TIME
  }

  public static void main(String[] args) {
    square_root_FP(1);
    loop_over_charArray_FP(new StringBuilder(), "hello");
    call_top_cost_FP();
  }

  // Mutant code being added
  static void unreachable_if_else_FP(boolean condition) {
    if (condition) {
      // Do nothing
    } else {
      // Do something
    }
  }

  static void unreachable_while_loop_FP(boolean condition) {
    while (condition) {
      // Do something
    }
  }

  static void unreachable_for_loop_FP(boolean condition) {
    for (int i = 0; condition; i++) {
      // Do something
    }
  }

  static void unreachable_if_else_statement_FP(boolean condition) {
    if (condition) {
      // Do something
    } else {
      // Do something else
    }
  }

  static void unreachable_switch_statement_FP(int value) {
    switch (value) {
      case 1:
        // Do something
        break;
      default:
        // Do something else
        break;
    }
  }
}