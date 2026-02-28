import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) result += i;
    return result;
  }

  // Mutant 1: Renamed'result' to 'a'
  @ExpectWarning("IL")
  int sum_mutant1(int n) {
    int a = 0;
    for (int i = 0; i < n; ) a += i;
    return a;
  }

  @NoWarning("IL")
  void falsePositive(int i) {
    while (--i > 0)
      ;
  }

  // Mutant 2: Renamed'result' to 'b'
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
  int sumDoWhile_mutant2(int n) {
    int b = 0;
    int i = 0;
    do {
      b += i;
    } while (i < n);
    return b;
  }

  // Mutant 3: Renamed'result' to 'c'
  @ExpectWarning("IL")
  int sumWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumWhileDo_mutant3(int n) {
    int c = 0;
    int i = 0;
    while (i < n) {
      c += i;
    }
    return c;
  }

  // Mutant 4: Renamed'result' to 'd'
  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd_mutant4(int n) {
    int d = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) d += i;
    }
    return d;
  }

  // Mutant 5: Renamed'result' to 'e'
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
  int sumOfOddDoWhile_mutant5(int n) {
    int e = 0;
    int i = 0;
    do {
      if (i % 2!= 0) e += i;
    } while (i < n);
    return e;
  }

  // Mutant 6: Renamed'result' to 'f'
  @ExpectWarning("IL")
  int sumOfOddWhileDo(int n) {
    int result = 0;
    int i = 0;
    while (i < n) {
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOddWhileDo_mutant6(int n) {
    int f = 0;
    int i = 0;
    while (i < n) {
      if (i % 2!= 0) f += i;
    }
    return f;
  }
}