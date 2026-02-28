import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        result -= i; // Unique code to maintain the structure
      }
      result += i;
    }
    return result;
  }

  @NoWarning("IL")
  void falsePositive(int i) {
    while (--i > 0) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        System.out.println("This will never be printed"); // Unique code to maintain the structure
      }
    }
  }

  @ExpectWarning("IL")
  int sumDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        result *= i; // Unique code to maintain the structure
      }
      result += i;
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        result /= i; // Unique code to maintain the structure
      }
      result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        result += i * 2; // Unique code to maintain the structure
      }
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        result -= i * 2; // Unique code to maintain the structure
      }
      if (i % 2!= 0) result += i;
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      boolean condition = getCondition();
      if (condition) { // Unreachable if statement
        result *= i * 2; // Unique code to maintain the structure
      }
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}