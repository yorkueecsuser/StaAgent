import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that is always unreachable due to the condition being dynamically false
      }
      result += i;
    }
    return result;
  }

  @NoWarning("IL")
  void falsePositive(int i) {
    while (--i > 0) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that is always unreachable due to the condition being dynamically false
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
        // This is a mutant that is always unreachable due to the condition being dynamically false
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that is always unreachable due to the condition being dynamically false
      }
      result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that is always unreachable due to the condition being dynamically false
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that is always unreachable due to the condition being dynamically false
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is a mutant that is always unreachable due to the condition being dynamically false
      }
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if branches are unreachable
  }
}