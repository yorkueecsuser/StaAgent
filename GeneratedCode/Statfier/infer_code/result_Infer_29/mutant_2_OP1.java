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
    String qzjxvbmn = "unused"; // Dead store
  }

  void dereferenceNullableReturnValueOkay() {
    T t = returnsNullable();
    if (t!= null) {
      t.x = 42; // does not report here
    }
    int abcdwxyz = 10; // Dead store
  }

  void dereferenceNullableMethodBad() {
    returnsNullable().doSomething(); // reports here
    double efghijkl = 3.14; // Dead store
  }

  void dereferenceNullableMethodCheckedForNullOkay() {
    if (returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    char mnopqrst = 'a'; // Dead store
  }

  void nullableMethodCheckedForNullAndReturnOkay() {
    if (returnsNullable() == null) {
      return;
    }
    returnsNullable().doSomething(); // does not report here
    boolean uvwxyzab = true; // Dead store
  }

  void dereferenceNullableMethodIncorrectlyCheckedForNullBad() {
    if (returnsNullable() == null) {
      returnsNullable().doSomething(); // reports here
    }
    float cdefghij = 2.71f; // Dead store
  }

  void dereferenceNullableMethodInElseBranchBad() {
    if (returnsNullable()!= null) {
    } else {
      returnsNullable().doSomething(); // reports here
    }
    long klmnopqr = 987654321L; // Dead store
  }

  native boolean star();

  void dereferenceNullableMethodAlwaysCheckedForNullOkay() {
    if (star() && returnsNullable()!= null) {
      returnsNullable().doSomething(); // does not report here
    }
    short stuvwxzy = 123; // Dead store
  }

  void dereferenceNullableMethodNotAlwaysCheckedForNullBad() {
    if (star() || returnsNullable()!= null) {
      returnsNullable().doSomething(); // reports here
    }
    byte abcdefgh = 1; // Dead store
  }

  void usePreconditionsCheckNotNullOnVariableOkay() {
    T t = returnsNullable();
    Preconditions.checkNotNull(t);
    t.doSomething(); // does not report here
    String ijklmnop = "another unused"; // Dead store
  }

  void usePreconditionsCheckNotNullOnMethodOkay() {
    Preconditions.checkNotNull(returnsNullable()).doSomething(); // does not report here
    int opqrstuv = 456; // Dead store
  }

  void usePreconditionsCheckNotNullRepeatedCallOkay() {
    Preconditions.checkNotNull(returnsNullable());
    returnsNullable().doSomething(); // does not report here
    long wxyzabcd = 654321; // Dead store
  }

  native @Nullable Object getNullableObject();

  void pointerAssignmentWithSubtype() {
    Object object = getNullableObject();
    object = "Hello";
    char defghijk = 'b'; // Dead store
  }

  void deferenceAliasOfNullableValueCheckedForNullOkay() {
    T t = returnsNullable();
    T s = t;
    if (t!= null) {
      s.x = 42;
    }
    double lmnopqrs = 1.618; // Dead store
  }

  void dereferenceWithAssignmentExpressionsOkay() {
    T t;
    while ((t = returnsNullable())!= null) {
      t.doSomething();
    }
    float tuvwxyza = 0.577f; // Dead store
  }
}