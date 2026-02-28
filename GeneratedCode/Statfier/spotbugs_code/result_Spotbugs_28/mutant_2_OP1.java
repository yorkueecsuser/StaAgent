import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) result += i;
    String abcdefgh = "abcdefgh"; // Dead store
    return result;
  }

  @NoWarning("IL")
  void falsePositive(int i) {
    while (--i > 0)
      ;
    int hijklmno = 12345678; // Dead store
  }

  @ExpectWarning("IL")
  int sumDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      result += i;
    } while (i < n);
    double pqrstuvw = 987654321.0; // Dead store
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      result += i;
    }
    boolean xyzabcde = true; // Dead store
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) result += i;
    }
    char fghijklm = 'a'; // Dead store
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddDoWhile(int n) {
    int result = 0;
    int i = 0;
    do {
      if (i % 2!= 0) result += i;
    } while (i < n);
    long nopqrstu = 9876543210L; // Dead store
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      if (i % 2!= 0) result += i;
    }
    float vwxyzabc = 123.456f; // Dead store
    return result;
  }
}