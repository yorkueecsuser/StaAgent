/**
 * String constructor - RANGE_ARRAY_OFFSET expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayOffsetExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in stringConstructor1");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor1");
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1);
  }

  public String stringConstructor2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in stringConstructor2");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor2");
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1);
  }

  private boolean getCondition() {
    // This method ensures that the condition is not a compile-time constant
    return false;
  }
}