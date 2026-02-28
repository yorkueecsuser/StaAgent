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
    square_root_FP(1); // square_root_FP has Top cost
    // BUG: INFINITE_EXECUTION_TIME​
  }

  public static void main(String[] args) {
    square_root_FP(1);
    loop_over_charArray_FP(new StringBuilder(), "hello");
    call_top_cost_FP();
  }
}

// Mutant 1: Renamed variable in square_root_FP() method
// Original: int i = 0;
// Mutated: int j = 0;
class InfiniteExecutionTime {
  static void square_root_FP(int x) {
    int j = 0;
    while (j * j < x) {
      j++;
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
    square_root_FP(1); // square_root_FP has Top cost
    // BUG: INFINITE_EXECUTION_TIME​
  }

  public static void main(String[] args) {
    square_root_FP(1);
    loop_over_charArray_FP(new StringBuilder(), "hello");
    call_top_cost_FP();
  }
}

// Mutant 2: Renamed variable in loop_over_charArray_FP() method
// Original: StringBuilder builder
// Mutated: StringBuilder sb
class InfiniteExecutionTime {
  static void square_root_FP(int x) {
    int i = 0;
    while (i * i < x) {
      i++;
    }
    // BUG: INFINITE_EXECUTION_TIME​
  }

  static void loop_over_charArray_FP(StringBuilder sb, String input) {
    for (Character c : input.toCharArray()) {
      // BUG: INFINITE_EXECUTION_TIME​
    }
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

// Mutant 3: Renamed variable in call_top_cost_FP() method
// Original: int x
// Mutated: int y
class InfiniteExecutionTime {
  static void square_root_FP(int y) {
    int i = 0;
    while (i * i < y) {
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
    square_root_FP(1); // square_root_FP has Top cost
    // BUG: INFINITE_EXECUTION_TIME​
  }

  public static void main(String[] args) {
    square_root_FP(1);
    loop_over_charArray_FP(new StringBuilder(), "hello");
    call_top_cost_FP();
  }
}