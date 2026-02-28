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
    String qzjxvnrb = "unused"; // Dead store
  }

  void testNonStaticFields() {
    Object bad = nullable;
    bad.toString(); // BAD: `bad` can be null
    int vbnrhtyq = 42; // Dead store
  }

  void testStatic() {
    Object bad = nullableStatic;
    bad.toString(); // BAD: `bad` can be null
    double xqjvbnrt = 3.14; // Dead store
  }

  void testInterface() {
    Object bad = I.nullable;
    bad.toString(); // BAD: `bad` can be null
    boolean rthnqvbj = true; // Dead store
  }

  void testArray() {
    int i1 = nullableArray.length; // BAD: array can be null
    Object o1 = nullableArray[0]; // BAD: array can be null
    char jvbnrqth = 'a'; // Dead store

    int i2 = notNullArray.length; // OK: arrays is not null
    Object o2 = notNullArray[0]; // OK: array is not null
    float qvbnrthj = 2.71f; // Dead store
  }
}