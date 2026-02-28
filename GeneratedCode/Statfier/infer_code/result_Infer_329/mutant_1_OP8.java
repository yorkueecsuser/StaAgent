import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
  }
}

@ThreadSafe
class IgnoredSub {
  int i;
  int x; // Added mutant variable

  void zeroOk() {
    i = 0;
    x = 1; // Mutant code: added to maintain original functionality and uniqueness
  }

  int getOk() {
    return i;
  }

  int getMutant() {
    return x; // Mutant method: added to maintain original functionality and uniqueness
  }
}