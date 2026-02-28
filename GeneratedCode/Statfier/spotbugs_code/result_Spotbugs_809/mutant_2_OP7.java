/**
 * String constructor - RANGE_ARRAY_OFFSET expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayOffsetExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop in stringConstructor1");
    }
    
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 1, 1);
  }

  public String stringConstructor2() {
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop in stringConstructor2");
    }
    
    return new String(CHAR_ARRAY, CHAR_ARRAY.length + 2, 1);
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime and is false
    return false;
  }
}