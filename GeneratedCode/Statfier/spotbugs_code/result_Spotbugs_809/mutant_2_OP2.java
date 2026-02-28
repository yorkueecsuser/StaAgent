/**
 * String constructor - RANGE_ARRAY_OFFSET expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayOffsetExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1);
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1); // Duplicate of the original return statement
  }

  public String stringConstructor2() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1);
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1); // Duplicate of the original return statement
  }
}