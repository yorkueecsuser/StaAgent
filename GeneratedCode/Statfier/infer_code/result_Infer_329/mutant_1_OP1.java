import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class Ignored {
  IgnoredSub s;

  void zeroOk() {
    s.zeroOk();
    // Dead Store Mutation
    int qzjxftnm = 42; // Unique variable declaration
  }
}

@ThreadSafe
class IgnoredSub {
  int i;

  void zeroOk() {
    i = 0;
    // Dead Store Mutation
    String abcdwxyz = "unused"; // Unique variable declaration
  }

  int getOk() {
    return i;
  }
}