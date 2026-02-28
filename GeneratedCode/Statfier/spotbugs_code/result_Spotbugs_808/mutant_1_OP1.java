/**
 * String constructors - RANGE_ARRAY_LENGTH expected
 *
 * @author yerayrodriguez@gmail.com
 */
class StringConstructorRangeArrayLengthExpected {

  private static final char[] CHAR_ARRAY = {'t', 'e','s', 't'};

  public String stringConstructor1() {
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 1);
    // Mutant: Dead Store
    String jxqfhtbz = "unused";
  }

  public String stringConstructor2() {
    return new String(CHAR_ARRAY, 0, CHAR_ARRAY.length + 2);
    // Mutant: Dead Store
    int qvbnrhty = 42;
  }

  public String stringConstructor3() {
    return new String(CHAR_ARRAY, 1, CHAR_ARRAY.length);
    // Mutant: Dead Store
    boolean klmnopqr = true;
  }

  public String stringConstructor4() {
    return new String(CHAR_ARRAY, 2, CHAR_ARRAY.length);
    // Mutant: Dead Store
    double wxyzabcd = 3.14;
  }

  public String stringConstructor5() {
    return new String(CHAR_ARRAY, CHAR_ARRAY.length, 1);
    // Mutant: Dead Store
    char efghijkl = 'a';
  }
}