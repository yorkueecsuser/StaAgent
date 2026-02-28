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

  void zeroOk() {
    i = 0;
  }

  int getOk() {
    return i;
  }

  // Mutated code
  int a;

  void zeroOkMutant() {
    a = 0;
  }

  int getOkMutant() {
    return a;
  }
}