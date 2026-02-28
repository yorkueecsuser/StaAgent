import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
    // Dead Store Mutation
    int abcdefgh = 42; // Unique unused variable declaration
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    i = 0;
    // Dead Store Mutation
    String ijklmnop = "unused"; // Unique unused variable declaration
  }

  int getOk() {
    return i;
  }
}