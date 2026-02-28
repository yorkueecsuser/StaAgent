import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;

interface A {
  public void f(@NonNull Object obj, @NonNull Object obj2);
}

interface B extends A {
  // relax constraint on second param
  @Override
  public void f(@NonNull Object obj, @CheckForNull Object obj2);
}

interface C extends A {}

class TestNonNull implements B {
  public void report(A a) {
    // Report: first arg is declared @NonNull by A
    a.f(null, new Object());
  }

  public void doNotReport(B b) {
    // The B interface declared arg 2 to be @CheckForNull, so this is OK
    b.f(new Object(), null);
  }

  public void report2(B b) {
    // arg1 must still not be null, though
    b.f(null, new Object());
  }

  public void report3(C c) {
    // C doesn't relax any constraints: A's constraints should apply
    c.f(new Object(), null);
  }

  @Override
  public void f(Object obj, Object obj2) {
    System.out.println(obj.hashCode()); // ok, declared @NonNull

    System.out.println(obj2.hashCode()); // BAD - declared @CheckForNull
  }

  // Mutated code
  public void reportx(A x) {
    // Report: first arg is declared @NonNull by A
    x.f(null, new Object());
  }

  public void doNotReporty(B y) {
    // The B interface declared arg 2 to be @CheckForNull, so this is OK
    y.f(new Object(), null);
  }

  public void report2z(B z) {
    // arg1 must still not be null, though
    z.f(null, new Object());
  }

  public void report3w(C w) {
    // C doesn't relax any constraints: A's constraints should apply
    w.f(new Object(), null);
  }

  @Override
  public void fx(Object a, Object b) {
    System.out.println(a.hashCode()); // ok, declared @NonNull

    System.out.println(b.hashCode()); // BAD - declared @CheckForNull
  }
}