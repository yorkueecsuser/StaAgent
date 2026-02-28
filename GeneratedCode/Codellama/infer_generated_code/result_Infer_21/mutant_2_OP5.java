import com.facebook.infer.annotation.*;

class InfiniteExecutionTime {
  static void square_root_FP(int x) {
    int i = 0;
    while (i * i < x) {
      i++;
    }
    // BUG: INFINITE_EXECUTION_TIME​

    // Unreachable switch statement mutant
    int value = getValue();
    switch(value) {
      case 1:
        i = 1;
        break;
      default:
        i = 2;
    }
  }

  static void loop_over_charArray_FP(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {
      // BUG: INFINITE_EXECUTION_TIME​

      // Unreachable switch statement mutant
      int value = getValue();
      switch(value) {
        case 1:
          c = 'a';
          break;
        default:
          c = 'b';
      }
    }
  }

  @Lockless
  static void call_top_cost_FP() {
    square_root_FP(1); // square_root_FP has Top cost
    // BUG: INFINITE_EXECUTION_TIME​

    // Unreachable switch statement mutant
    int value = getValue();
    switch(value) {
      case 1:
        square_root_FP(2);
        break;
      default:
        square_root_FP(3);
    }
  }

  public static void main(String[] args) {
    square_root_FP(1);
    loop_over_charArray_FP(new StringBuilder(), "hello");
    call_top_cost_FP();
  }
}