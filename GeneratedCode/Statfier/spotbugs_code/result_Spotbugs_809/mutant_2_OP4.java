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
      // This block is intended to be unreachable
      System.out.println("This should never print");
    } else {
      // Alternative code path
      System.out.println("Alternative path");
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1);
  }

  public String stringConstructor2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This should never print");
    } else {
      // Alternative code path
      System.out.println("Alternative path");
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1);
  }

  private boolean getCondition() {
    // Always returns false, making the if-block unreachable
    return false;
  }
}