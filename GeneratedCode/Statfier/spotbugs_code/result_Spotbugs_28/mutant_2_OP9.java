import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    int i = 0;
    do {
      result += i;
    } while (i < n); // Equivalent do-while loop
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
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    do {
      result += i;
      i++; // Increment moved inside to avoid infinite loop
    } while (i < n); // Equivalent do-while loop
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    int i = 0;
    do {
      if (i % 2!= 0) result += i;
    } while (i < n); // Equivalent do-while loop
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      if (i % 2!= 0) result += i;
    } while (i < n);
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    do {
      if (i % 2!= 0) result += i;
      i++; // Increment moved inside to avoid infinite loop
    } while (i < n); // Equivalent do-while loop
    return result;
  }
}