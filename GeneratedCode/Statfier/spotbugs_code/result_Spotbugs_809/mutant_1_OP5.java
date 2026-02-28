/**
 * String constructor - RANGE_ARRAY_OFFSET expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayOffsetExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is an unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1);
  }

  public String stringConstructor2() {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because getCondition() returns false
        System.out.println("This is another unreachable switch case.");
        break;
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1);
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the switch cases are unreachable
  }
}