/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
  }

  public String stringConstructor2() {
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
  }

  public String stringConstructor3() {
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
  }

  public String stringConstructor4() {
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
  }

  public String stringConstructor5() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
  }

  // Mutated code
  private static final char[] b = {'t', 'e','s', 't'};

  public String a() {
    return new String(b, 0, b.length + 1);
  }

  public String c() {
    return new String(b, 0, b.length + 2);
  }

  public String d() {
    return new String(b, 1, b.length);
  }

  public String e() {
    return new String(b, 2, b.length);
  }

  public String f() {
    return new String(b, b.length, 1);
  }
}