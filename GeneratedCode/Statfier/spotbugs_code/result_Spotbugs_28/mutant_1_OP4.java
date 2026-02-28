import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (shouldRun &&!shouldRun) {
          result -= i; // This branch is unreachable
        } else {
          result += i;
        }
      }
    }
    return result;
  }

  @NoWarning("IL")
  void falsePositive(int i) {
    while (--i > 0) {
      boolean shouldRun = getCondition();
      if (shouldRun &&!shouldRun) {
        // Unreachable if-else statement
        System.out.println("This will never be printed");
      } else {
        // Do nothing
      }
    }
  }

  @ExpectWarning("IL")
  int sumDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (shouldRun &&!shouldRun) {
          result -= i; // This branch is unreachable
        } else {
          result += i;
        }
      }
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (shouldRun &&!shouldRun) {
          result -= i; // This branch is unreachable
        } else {
          result += i;
        }
      }
      i++;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (shouldRun &&!shouldRun) {
          result -= i; // This branch is unreachable
        } else {
          if (i % 2!= 0) result += i;
        }
      }
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (shouldRun &&!shouldRun) {
          result -= i; // This branch is unreachable
        } else {
          if (i % 2!= 0) result += i;
        }
      }
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Unreachable if-else statement
        if (shouldRun &&!shouldRun) {
          result -= i; // This branch is unreachable
        } else {
          if (i % 2!= 0) result += i;
        }
      }
      i++;
    }
    return result;
  }

  private boolean getCondition() {
    return true; // This method ensures the condition is dynamically determined at runtime
  }
}