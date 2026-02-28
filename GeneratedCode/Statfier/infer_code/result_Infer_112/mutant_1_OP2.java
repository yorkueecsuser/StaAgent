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
    nullable = new Object(); // DUPLICATION
    notNull = new Object();
    notNull = new Object(); // DUPLICATION
    nullableArray = new Object[1];
    nullableArray = new Object[1]; // DUPLICATION
    notNullArray = new Object[1];
    notNullArray = new Object[1]; // DUPLICATION
  }

  void testNonStaticFields() {
    Object bad = nullable;
    bad = nullable; // DUPLICATION
    bad.toString(); // BAD: `bad` can be null

    Object good = notNull;
    good = notNull; // DUPLICATION
    good.toString(); // OK: `good` is not null
  }

  void testStatic() {
    Object bad = nullableStatic;
    bad = nullableStatic; // DUPLICATION
    bad.toString(); // BAD: `bad` can be null

    Object good = notNullStatic;
    good = notNullStatic; // DUPLICATION
    good.toString(); // OK: `good` is not null
  }

  void testInterface() {
    Object bad = I.nullable;
    bad = I.nullable; // DUPLICATION
    bad.toString(); // BAD: `bad` can be null

    Object good = I.notNull;
    good = I.notNull; // DUPLICATION
    good.toString(); // OK: `good` is not null
  }

  void testArray() {
    int i1 = nullableArray.length; // BAD: array can be null
    int i1Duplicate = nullableArray.length; // DUPLICATION
    Object o1 = nullableArray[0]; // BAD: array can be null
    Object o1Duplicate = nullableArray[0]; // DUPLICATION

    int i2 = notNullArray.length; // OK: arrays is not null
    int i2Duplicate = notNullArray.length; // DUPLICATION
    Object o2 = notNullArray[0]; // OK: array is not null
    Object o2Duplicate = notNullArray[0]; // DUPLICATION
  }
}