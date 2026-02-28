import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

class BadComparisonBugTest {
  @Test
  public void testShowBugNegativeValues() {
    int[] values = { -1, -2, -3 };
    BadComparisonBug.showBug(values);
    // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
  }

  @Test
  public void testShowBugZero() {
    int[] values = { 0 };
    BadComparisonBug.showBug(values);
    // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
  }

  @Test
  public void testShowBugPositiveValues() {
    int[] values = { 1, 2, 3 };
    BadComparisonBug.showBug(values);
    // TRIGGER BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
  }
}