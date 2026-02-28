import javax.annotation.Nullable;

class NullFieldAccess {

  interface I {
    @Nullable Object nullable = new Object();
    Object notNull = new Object();
  }

  @Nullable Object nullable;
  Object notNull;

  static final @Nullable Object nullableStatic = new Object();
  static final Object notNullStatic = new Object();

  @Nullable Object[] nullableArray;
  Object[] notNullArray;

  NullFieldAccess() {
    nullable = new Object();
    notNull = new Object();
    nullableArray = new Object[1];
    notNullArray = new Object[1];

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  void testNonStaticFields() {
    Object bad = nullable;
    bad.toString(); // BAD: `bad` can be null

    Object good = notNull;
    good.toString(); // OK: `good` is not null

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  void testStatic() {
    Object bad = nullableStatic;
    bad.toString(); // BAD: `bad` can be null

    Object good = notNullStatic;
    good.toString(); // OK: `good` is not null

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  void testInterface() {
    Object bad = I.nullable;
    bad.toString(); // BAD: `bad` can be null

    Object good = I.notNull;
    good.toString(); // OK: `good` is not null

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  void testArray() {
    int i1 = nullableArray.length; // BAD: array can be null
    Object o1 = nullableArray[0]; // BAD: array can be null

    int i2 = notNullArray.length; // OK: arrays is not null
    Object o2 = notNullArray[0]; // OK: array is not null

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because condition is never set to true
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}