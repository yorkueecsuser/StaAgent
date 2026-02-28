/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1); // Mutant
  }

  public String stringConstructor2() {
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2); // Mutant
  }

  public String stringConstructor3() {
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length); // Mutant
  }

  public String stringConstructor4() {
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length); // Mutant
  }

  public String stringConstructor5() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1); // Mutant
  }
}