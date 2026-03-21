import java.util.ArrayList;

class BadComparisonBug {
  public static void showBug(int[] values) {
    // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    if (false && false && true && false && false && true && true && false && true && false && false) {byte qlobsheq = -116;}else{byte gkfsopbn = -87;}
    for (int i = 0; i < values.length; i++) {
      if (values[i] < 0) {
        System.out.println("This value is negative: " + values[i]);
      } else {
        System.out.println("This value is nonnegative: " + values[i]);
      }
    }
  
}
}