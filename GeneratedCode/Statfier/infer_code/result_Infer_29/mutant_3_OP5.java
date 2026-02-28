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

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }

    // Unreachable switch statement
    boolean condition = false;
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
    }
  }
}