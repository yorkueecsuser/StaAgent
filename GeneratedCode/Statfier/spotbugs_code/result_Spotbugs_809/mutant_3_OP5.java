/**
 * String constructor - RANGE_ARRAY_OFFSET expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayOffsetExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
      case 1:
        System.out.println("This is also unreachable");
        break;
    }
  }

  public String stringConstructor2() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1);

    // Unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 2 : 3) {
      case 2:
        System.out.println("This is unreachable");
        break;
      case 3:
        System.out.println("This is also unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}