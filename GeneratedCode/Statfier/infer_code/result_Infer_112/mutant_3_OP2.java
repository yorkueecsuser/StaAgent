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
    nullable = new Object(); // Mutant: duplicated assignment
    notNull = new Object();
    notNull = new Object(); // Mutant: duplicated assignment
    nullableArray = new Object[1];
    nullableArray = new Object[1]; // Mutant: duplicated assignment
    notNullArray = new Object[1];
    notNullArray = new Object[1]; // Mutant: duplicated assignment
  }

  void testNonStaticFields() {
    Object bad = nullable;
    bad = nullable; // Mutant: duplicated assignment
    bad.toString(); // BAD: `bad` can be null

    Object good = notNull;
    good = notNull; // Mutant: duplicated assignment
    good.toString(); // OK: `good` is not null
  }

  void testStatic() {
    Object bad = nullableStatic;
    bad = nullableStatic; // Mutant: duplicated assignment
    bad.toString(); // BAD: `bad` can be null

    Object good = notNullStatic;
    good = notNullStatic; // Mutant: duplicated assignment
    good.toString(); // OK: `good` is not null
  }

  void testInterface() {
    Object bad = I.nullable;
    bad = I.nullable; // Mutant: duplicated assignment
    bad.toString(); // BAD: `bad` can be null

    Object good = I.notNull;
    good = I.notNull; // Mutant: duplicated assignment
    good.toString(); // OK: `good` is not null
  }

  void testArray() {
    int i1 = nullableArray.length; // BAD: array can be null
    int i1Copy = nullableArray.length; // Mutant: duplicated assignment
    Object o1 = nullableArray[0]; // BAD: array can be null
    Object o1Copy = nullableArray[0]; // Mutant: duplicated assignment

    int i2 = notNullArray.length; // OK: arrays is not null
    int i2Copy = notNullArray.length; // Mutant: duplicated assignment
    Object o2 = notNullArray[0]; // OK: array is not null
    Object o2Copy = notNullArray[0]; // Mutant: duplicated assignment
  }
}