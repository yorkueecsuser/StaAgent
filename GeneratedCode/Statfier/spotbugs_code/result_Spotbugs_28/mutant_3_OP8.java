import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) result += i;
    return result;
  }

  // Mutant for sum method
  @ExpectWarning("IL")
  int sumx(int x) {
    int y = 0;
    for (int z = 0; z < x; ) y += z;
    return y;
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

  // Mutant for sumDoWhile method
  @ExpectWarning("IL")
  int sumDoWhiled(int d) {
    int e = 0;
    int f = 0;
    do {
      e += f;
    } while (f < d);
    return e;
  }

  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      result += i;
    }
    return result;
  }

  // Mutant for sumWhileDo method
  @ExpectWarning("IL")
  int sumWhileDow(int w) {
    int v = 0;
    int u = 0;
    while (u < w) {
      v += u;
    }
    return v;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  // Mutant for sumOfOdd method
  @ExpectWarning("IL")
  int sumOfOddq(int q) {
    int r = 0;
    for (int s = 0; s < q; ) {
      if (s % 2!= 0) r += s;
    }
    return r;
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

  // Mutant for sumOfOddDoWhile method
  @ExpectWarning("IL")
  int sumOfOddDoWhiled(int d) {
    int e = 0;
    int f = 0;
    do {
      if (f % 2!= 0) e += f;
    } while (f < d);
    return e;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  // Mutant for sumOfOddWhileDo method
  @ExpectWarning("IL")
  int sumOfOddWhileDow(int w) {
    int v = 0;
    int u = 0;
    while (u < w) {
      if (u % 2!= 0) v += u;
    }
    return v;
  }
}