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
    i = 0;  // Original assignment
    i = 0;  // Duplicated assignment
  }

  int getOk() {
    return i;
  }
}