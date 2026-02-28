import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
    // Dead store mutation
    int abcdefgh = 42; // Unique dead store variable
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    i = 0;
    // Dead store mutation
    String ijklmnop = "unused"; // Unique dead store variable
  }

  int getOk() {
    return i;
  }
}