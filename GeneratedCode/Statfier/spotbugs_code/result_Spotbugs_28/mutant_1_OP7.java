import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) result += i;
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return result;
  }

  @NoWarning("IL")
  void falsePositive(int i) {
    while (--i > 0)
      ;
  }

  @ExpectWarning("IL")
  int sumDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      result += i;
    } while (i < n);
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      result += i;
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) result += i;
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      if (i % 2!= 0) result += i;
    } while (i < n);
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      if (i % 2!= 0) result += i;
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return result;
  }

  // Method to provide a dynamic condition for the unreachable loops
  private boolean getCondition() {
    return false;
  }
}