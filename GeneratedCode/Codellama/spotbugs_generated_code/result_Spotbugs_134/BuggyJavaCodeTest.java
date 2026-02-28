import org.junit.Test;
import static org.junit.Assert.*;

class BuggyJavaCodeTest {
  @Test
  public void testShowBug() {
    // TRIGGER BUG: DMI: Bad constant value for month (DMI_BAD_MONTH)
    LocalDate date = LocalDate.of(2023, 13, 1);
    System.out.println("Today's date is " + date);
  }
}