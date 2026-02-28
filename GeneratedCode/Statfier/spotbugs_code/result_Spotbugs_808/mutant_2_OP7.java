/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
  }

  public String stringConstructor2() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
  }

  public String stringConstructor3() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
  }

  public String stringConstructor4() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
  }

  public String stringConstructor5() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
  }

  private boolean getCondition() {
    return false;
  }
}