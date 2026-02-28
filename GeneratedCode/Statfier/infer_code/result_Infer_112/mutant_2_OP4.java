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

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This block is reachable");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable");
    }
  }

  void testNonStaticFields() {
    Object bad = nullable;
    bad.toString(); // BAD: `bad` can be null

    Object good = notNull;
    good.toString(); // OK: `good` is not null

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This block is reachable in testNonStaticFields");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable in testNonStaticFields");
    }
  }

  void testStatic() {
    Object bad = nullableStatic;
    bad.toString(); // BAD: `bad` can be null

    Object good = notNullStatic;
    good.toString(); // OK: `good` is not null

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This block is reachable in testStatic");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable in testStatic");
    }
  }

  void testInterface() {
    Object bad = I.nullable;
    bad.toString(); // BAD: `bad` can be null

    Object good = I.notNull;
    good.toString(); // OK: `good` is not null

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This block is reachable in testInterface");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable in testInterface");
    }
  }

  void testArray() {
    int i1 = nullableArray.length; // BAD: array can be null
    Object o1 = nullableArray[0]; // BAD: array can be null

    int i2 = notNullArray.length; // OK: arrays is not null
    Object o2 = notNullArray[0]; // OK: array is not null

    // Mutant: Unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This block is reachable in testArray");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable in testArray");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}