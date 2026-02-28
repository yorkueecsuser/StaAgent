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
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      t.x = 84; // This line is unreachable
    }
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      t.x = 84; // This line is unreachable
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      t.doSomething(); // This line is unreachable
    }
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      returnsNullable().doSomething(); // This line is unreachable
    }
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      object.toString(); // This line is unreachable
    }
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      s.x = 84; // This line is unreachable
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      t.doSomething(); // This line is unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if blocks unreachable
  }
}