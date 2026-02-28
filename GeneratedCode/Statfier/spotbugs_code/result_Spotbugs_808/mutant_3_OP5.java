/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
  }

  public String stringConstructor2() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
  }

  public String stringConstructor3() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
  }

  public String stringConstructor4() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
  }

  public String stringConstructor5() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }
}