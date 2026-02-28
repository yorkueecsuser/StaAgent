import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

class NullableViolation {

  class T {
    int x;

    void doSomething() {}
  }

  static native @Nullable T returnsNullable();

  void dereferenceNullableReturnValueBad() {
    T t = returnsNullable();
    t.x = 42; // reports here
    T a = returnsNullable();
    a.x = 42; // mutant
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }
    T b = returnsNullable();
    if (b!= null) {
      b.x = 42; // mutant
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here
    T c = returnsNullable();
    c.doSomething(); // mutant
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    T d = returnsNullable();
    if (d!= null) {
      d.doSomething(); // mutant
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here
    T e = returnsNullable();
    if (e == null) {
      return;
    }
    e.doSomething(); // mutant
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }
    T f = returnsNullable();
    if (f == null) {
      f.doSomething(); // mutant
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }
    T g = returnsNullable();
    if (g!= null) {
    } else {
      g.doSomething(); // mutant
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    T h = returnsNullable();
    if (star() && h!= null) {
      h.doSomething(); // mutant
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }
    T i = returnsNullable();
    if (star() || i!= null) {
      i.doSomething(); // mutant
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here
    T j = returnsNullable();
    Preconditions.checkNotNull(j);
    j.doSomething(); // mutant
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here
    T k = returnsNullable();
    Preconditions.checkNotNull(k).doSomething(); // mutant
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here
    T l = returnsNullable();
    Preconditions.checkNotNull(l);
    l.doSomething(); // mutant
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";
    Object m = getNullableObject();
    m = "World"; // mutant
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }
    T n = returnsNullable();
    T o = n;
    if (n!= null) {
      o.x = 42; // mutant
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }
    T p;
    while ((p = returnsNullable())!= null) {
      p.doSomething(); // mutant
    }
  }
}