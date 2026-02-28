import com.facebook.infer.annotation.*;

class InfiniteExecutionTime {
  static void square_root_FP(int x) {
    int i = 0;
    do {
      i++;
    } while (i * i < x);
    // BUG: INFINITE_EXECUTION_TIME​
  }

  static void loop_over_charArray_FP(StringBuilder builder, String input) {
    do {
      for (Character c : input.toCharArray()) {
        // BUG: INFINITE_EXECUTION_TIME​
      }
    } while (builder.length() > 0);
  }

  @Lockless
  static void call_top_cost_FP() {
    square_root_FP(1); // square_root_FP has Top cost
    // BUG: INFINITE_EXECUTION_TIME​
  }

  public static void main(String[] args) {
    square_root_FP(1);
    loop_over_charArray_FP(new StringBuilder(), "hello");
    call_top_cost_FP();
  }
}