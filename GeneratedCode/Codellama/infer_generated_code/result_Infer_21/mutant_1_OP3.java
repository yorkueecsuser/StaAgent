import com.facebook.infer.annotation.*;

class InfiniteExecutionTime {
  static void square_root_FP(int x) {
    int i = 0;
    while (i * i < x) {
      i++;
    }
    // BUG: INFINITE_EXECUTION_TIME​
  }

  static void loop_over_charArray_FP(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {
      // BUG: INFINITE_EXECUTION_TIME​
    }
  }

  @Lockless
  static void call_top_cost_FP() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      square_root_FP(1); // square_root_FP has Top cost
    } else {
      loop_over_charArray_FP(new StringBuilder(), "hello");
    }
    // BUG: INFINITE_EXECUTION_TIME​
  }

  public static void main(String[] args) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      square_root_FP(1);
    } else {
      loop_over_charArray_FP(new StringBuilder(), "hello");
    }
    call_top_cost_FP();
  }
}