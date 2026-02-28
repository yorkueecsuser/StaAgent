/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    int qwertyui = 42; // Dead store
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
  }

  public String stringConstructor2() {
    String asdfghjk = "unused"; // Dead store
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
  }

  public String stringConstructor3() {
    boolean zxcvbnml = true; // Dead store
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
  }

  public String stringConstructor4() {
    double poiuytrew = 3.14; // Dead store
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
  }

  public String stringConstructor5() {
    char lkjhgfdsa = 'x'; // Dead store
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
  }
}