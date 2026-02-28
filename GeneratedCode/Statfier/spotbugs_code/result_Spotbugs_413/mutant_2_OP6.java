import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

class DumbMethodInvocations implements Iterator {
  @ExpectWarning("DMI_EMPTY_DB_PASSWORD")
  Connection getConnection1() throws SQLException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "");
  }

  @ExpectWarning("DMI_CONSTANT_DB_PASSWORD")
  Connection getConnection2() throws SQLException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "secret");
  }

  @ExpectWarning("DMI_USELESS_SUBSTRING")
  String f(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    return s.substring(0);
  }

  String g(String s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    for (int i = 0; i < s.length(); i++) if (s.substring(i).hashCode() == 42) return s;
    return null;
  }

  @Override
  @ExpectWarning("DMI_CALLING_NEXT_FROM_HASNEXT")
  public boolean hasNext() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    return next()!= null;
  }

  @Override
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    return null;
  }

  @Override
  public void remove() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
  }

  public void falsePositive() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    Date today = Calendar.getInstance().getTime();
    System.out.println(today);
    today.setDate(16);
    System.out.println(today);
  }

  @ExpectWarning("DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT")
  double convertToDouble(int i) {
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) { /* Unreachable for loop */ }
    return Double.longBitsToDouble(i);
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    new File("c:\\test.txt");
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile2() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    new File("c:\\temp", "test.txt");
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    new PrintStream("c:\\test.txt", "UTF-8");
  }

  @NoWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream2() throws IOException {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { /* Unreachable for loop */ }
    new PrintStream("UTF-8", "c:\\test.txt");
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}