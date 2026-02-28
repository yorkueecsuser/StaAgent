import edu.umd.cs.findbugs.annotations.NonNull;

class NonNullParamDeref {
  static void foo(@NonNull Object o) {}

  void bar(@NonNull Object o) {}

  int count;

  void report1(boolean a) {

    Object x = null;
    if (a) {
      x = new Object();
      x = new Object(); // Mutant: duplicated assignment
    }

    foo(x);
  }

  void report2(boolean b) {
    Object x = null;

    if (b) {
      x = new Object();
      x = new Object(); // Mutant: duplicated assignment
    }

    bar(x);
  }
}