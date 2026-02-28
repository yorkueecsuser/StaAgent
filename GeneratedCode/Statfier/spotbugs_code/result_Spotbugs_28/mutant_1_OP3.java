import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    boolean condition = getCondition();
    for (int i = 0; i < n; ) {
      if (condition) { // Unreachable if statement
        result -= i; // Unique mutation
      }
      result += i;
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
    boolean condition = getCondition();
    do {
      if (condition) { // Unreachable if statement
        result -= i; // Unique mutation
      }
      result += i;
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    boolean condition = getCondition();
    while (i < n) {
      if (condition) { // Unreachable if statement
        result -= i; // Unique mutation
      }
      result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    boolean condition = getCondition();
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) result += i;
      if (condition) { // Unreachable if statement
        result *= i; // Unique mutation
      }
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddDoWhile(int n) {
    int result = 0;
    int i = 0;
    boolean condition = getCondition();
    do {
      if (i % 2!= 0) result += i;
      if (condition) { // Unreachable if statement
        result *= i; // Unique mutation
      }
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    boolean condition = getCondition();
    while (i < n) {
      if (i % 2!= 0) result += i;
      if (condition) { // Unreachable if statement
        result *= i; // Unique mutation
      }
    }
    return result;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}