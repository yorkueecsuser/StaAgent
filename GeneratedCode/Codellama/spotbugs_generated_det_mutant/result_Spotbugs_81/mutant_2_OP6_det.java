import java.util.ArrayList;

class BadComparisonBug {
  public static void showBug(int[] values) {
    // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    for  (int wmehzpne = 0; wmehzpne < 0; wmehzpne++) {String lgglacwy = "oevxasuq";}
    for (int i = 0; i < values.length; i++) {
      if (values[i] < 0) {
        System.out.println("This value is negative: " + values[i]);
      } else {
        System.out.println("This value is nonnegative: " + values[i]);
      }
    }
  
}
}