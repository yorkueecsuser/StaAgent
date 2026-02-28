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

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      t.x = 43; // This loop is unreachable
    }
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      t.doSomething(); // This loop is unreachable
    }
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      returnsNullable().doSomething(); // This loop is unreachable
    }
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      object = "World"; // This loop is unreachable
    }
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      s.x = 43; // This loop is unreachable
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }

    // Inserted unreachable while loop
    boolean conditionWhile = star() && false;
    while (conditionWhile) {
      t.doSomething(); // This loop is unreachable
    }
  }
}