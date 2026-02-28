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
    boolean shouldRun = false;
    if (shouldRun) {
      t.x = 43; // unreachable code
    } else {
      t.x = 44; // unreachable code
    }
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }
    boolean shouldRun = false;
    if (shouldRun) {
      t.x = 43; // unreachable code
    } else {
      t.x = 44; // unreachable code
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here
    boolean shouldRun = false;
    if (shouldRun) {
      t.doSomething(); // unreachable code
    } else {
      t.doSomething(); // unreachable code
    }
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // unreachable code
    } else {
      returnsNullable().doSomething(); // unreachable code
    }
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";
    boolean shouldRun = false;
    if (shouldRun) {
      object.toString(); // unreachable code
    } else {
      object.toString(); // unreachable code
    }
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }
    boolean shouldRun = false;
    if (shouldRun) {
      s.doSomething(); // unreachable code
    } else {
      s.doSomething(); // unreachable code
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }
    boolean shouldRun = false;
    if (shouldRun) {
      t.doSomething(); // unreachable code
    } else {
      t.doSomething(); // unreachable code
    }
  }
}