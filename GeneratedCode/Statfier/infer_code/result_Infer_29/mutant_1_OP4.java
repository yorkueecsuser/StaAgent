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

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      t.x = 99; // Unreachable code
    } else {
      t.x = 88; // Unreachable code
    }
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      t.x = 99; // Unreachable code
    } else {
      t.x = 88; // Unreachable code
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      t.doSomething(); // Unreachable code
    } else {
      t.doSomething(); // Unreachable code
    }
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      Preconditions.checkNotNull(returnsNullable()).doSomething(); // Unreachable code
    } else {
      Preconditions.checkNotNull(returnsNullable()).doSomething(); // Unreachable code
    }
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      returnsNullable().doSomething(); // Unreachable code
    } else {
      returnsNullable().doSomething(); // Unreachable code
    }
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      object = "World"; // Unreachable code
    } else {
      object = "Universe"; // Unreachable code
    }
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      s.x = 99; // Unreachable code
    } else {
      s.x = 88; // Unreachable code
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }

    // Mutant: Unreachable if-else statement
    boolean shouldRun = false;
    if (shouldRun) {
      t.doSomething(); // Unreachable code
    } else {
      t.doSomething(); // Unreachable code
    }
  }
}