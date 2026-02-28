/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code in stringConstructor1");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor1");
    }
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
  }

  public String stringConstructor2() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code in stringConstructor2");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor2");
    }
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
  }

  public String stringConstructor3() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code in stringConstructor3");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor3");
    }
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
  }

  public String stringConstructor4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code in stringConstructor4");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor4");
    }
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
  }

  public String stringConstructor5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable code in stringConstructor5");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in stringConstructor5");
    }
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}