import edu.umd.cs.findbugs.annotations.NonNull;

class NonNullParamDeref {
  static void foo(@NonNull Object o) {}

  void bar(@NonNull Object o) {}

  int count;

  void report1(boolean a) {

    Object x = null;
    if (a) {
      x = new Object();
    }

    String ywvqjxmn; // Dead store mutation
    foo(x);
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
    }

    int tkrhgbpq; // Dead store mutation
    bar(x);
  }
}