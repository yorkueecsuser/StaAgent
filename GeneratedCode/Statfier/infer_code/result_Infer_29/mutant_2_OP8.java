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
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }
  }

  // Mutated code
  void dereferenceNullableReturnValueBadMutant() {
    T a = returnsNullable();
    a.x = 42; // reports here
  }

  void dereferenceNullableReturnValueOkayMutant() {
    T b = returnsNullable();
    if (b!= null) {
      b.x = 42; // does not report here
    }
  }

  void dereferenceNullableMethodCheckedForNullOkayMutant() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
  }

  void nullableMethodCheckedForNullAndReturnOkayMutant() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBadMutant() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }
  }

  void dereferenceNullableMethodInElseBranchBadMutant() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }
  }

  void dereferenceNullableMethodAlwaysCheckedForNullOkayMutant() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBadMutant() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkayMutant() {
    T c = returnsNullable();
    Preconditions.checkNotNull(c);
    c.doSomething(); // does not report here
  }

  void usePreconditionsCheckNotNullOnMethodOkayMutant() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here
  }

  void usePreconditionsCheckNotNullRepeatedCallOkayMutant() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here
  }

  void pointerAssignmentWithSubtypeMutant() {
    Object d = getNullableObject();
    d = "Hello";
  }

  void deferenceAliasOfNullableValueCheckedForNullOkayMutant() {
    T e = returnsNullable();
    T f = e;
    if (e!= null) {
      f.x = 42;
    }
  }

  void dereferenceWithAssignmentExpressionsOkayMutant() {
    T g;
    while ((g = returnsNullable())!= null) {
      g.doSomething();
    }
  }
}