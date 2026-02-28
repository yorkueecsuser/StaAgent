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
  }

  void testNonStaticFields() {
    Object bad = nullable;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      bad.toString(); // BAD: `bad` can be null
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block");
    }

    Object good = notNull;
    good.toString(); // OK: `good` is not null
  }

  void testStatic() {
    Object bad = nullableStatic;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      bad.toString(); // BAD: `bad` can be null
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block");
    }

    Object good = notNullStatic;
    good.toString(); // OK: `good` is not null
  }

  void testInterface() {
    Object bad = I.nullable;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      bad.toString(); // BAD: `bad` can be null
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block");
    }

    Object good = I.notNull;
    good.toString(); // OK: `good` is not null
  }

  void testArray() {
    int i1 = nullableArray.length; // BAD: array can be null
    boolean shouldRun = getCondition();
    if (shouldRun) {
      Object o1 = nullableArray[0]; // BAD: array can be null
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block");
    }

    int i2 = notNullArray.length; // OK: arrays is not null
    Object o2 = notNullArray[0]; // OK: array is not null
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}