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
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_CONSTANT_DB_PASSWORD")
  Connection getConnection2() throws SQLException {
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "secret");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_USELESS_SUBSTRING")
  String f(String s) {
    return s.substring(0);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  String g(String s) {
    for (int i = 0; i < s.length(); i++) if (s.substring(i).hashCode() == 42) return s;
    return null;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @Override
  @ExpectWarning("DMI_CALLING_NEXT_FROM_HASNEXT")
  public boolean hasNext() {
    return next()!= null;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @Override
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    return null;
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @Override
  public void remove() {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public void falsePositive() {
    Date today = Calendar.getInstance().getTime();
    System.out.println(today);
    today.setDate(16);
    System.out.println(today);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT")
  double convertToDouble(int i) {
    return Double.longBitsToDouble(i);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile() {
    new File("c:\\test.txt");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile2() {
    new File("c:\\temp", "test.txt");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream() throws IOException {
    new PrintStream("c:\\test.txt", "UTF-8");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @NoWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream2() throws IOException {
    new PrintStream("UTF-8", "c:\\test.txt");
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}