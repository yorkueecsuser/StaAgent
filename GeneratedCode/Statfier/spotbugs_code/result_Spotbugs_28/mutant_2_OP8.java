import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class InfiniteIterativeLoop {
  @ExpectWarning("IL")
  int sum(int n) {
    int result = 0;
    for (int i = 0; i < n; ) result += i;
    return result;
  }

  // Mutant 1: Renamed 'i' to 'a'
  @ExpectWarning("IL")
  int sumMutant1(int n) {
    int x = 0;
    for (int a = 0; a < n; ) x += a;
    return x;
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

  // Mutant 2: Renamed'result' to 'b'
  @ExpectWarning("IL")
  int sumDoWhileMutant2(int n) {
    int b = 0;
    int j = 0;
    do {
      b += j;
    } while (j < n);
    return b;
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

  // Mutant 3: Renamed 'n' to 'c'
  @ExpectWarning("IL")
  int sumWhileDoMutant3(int c) {
    int result = 0;
    int i = 0;
    while (i < c) {
      result += i;
    }
    return result;
  }

  @ExpectWarning("IL")
  int sumOfOdd(int n) {
    int result = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) result += i;
    }
    return result;
  }

  // Mutant 4: Renamed'result' to 'd'
  @ExpectWarning("IL")
  int sumOfOddMutant4(int n) {
    int d = 0;
    for (int i = 0; i < n; ) {
      if (i % 2!= 0) d += i;
    }
    return d;
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

  // Mutant 5: Renamed 'i' to 'e'
  @ExpectWarning("IL")
  int sumOfOddDoWhileMutant5(int n) {
    int result = 0;
    int e = 0;
    do {
      if (e % 2!= 0) result += e;
    } while (e < n);
    return result;
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

  // Mutant 6: Renamed 'n' to 'f'
  @ExpectWarning("IL")
  int sumOfOddWhileDoMutant6(int f) {
    int result = 0;
    int i = 0;
    while (i < f) {
      if (i % 2!= 0) result += i;
    }
    return result;
  }
}