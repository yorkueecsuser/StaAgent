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
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_CONSTANT_DB_PASSWORD")
  Connection getConnection2() throws SQLException {
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "secret");
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 2:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_USELESS_SUBSTRING")
  String f(String s) {
    return s.substring(0);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 3:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  String g(String s) {
    for (int i = 0; i < s.length(); i++) if (s.substring(i).hashCode() == 42) return s;
    return null;
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 4:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @Override
  @ExpectWarning("DMI_CALLING_NEXT_FROM_HASNEXT")
  public boolean hasNext() {
    return next()!= null;
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 5:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @Override
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    return null;
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 6:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @Override
  public void remove() {}

  public void falsePositive() {
    Date today = Calendar.getInstance().getTime();
    System.out.println(today);
    today.setDate(16);
    System.out.println(today);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 7:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT")
  double convertToDouble(int i) {
    return Double.longBitsToDouble(i);
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 8:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile() {
    new File("c:\\test.txt");
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 9:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile2() {
    new File("c:\\temp", "test.txt");
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 10:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream() throws IOException {
    new PrintStream("c:\\test.txt", "UTF-8");
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 11:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  @NoWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream2() throws IOException {
    new PrintStream("UTF-8", "c:\\test.txt");
    // Unreachable switch statement
    int unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case 12:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case is also unreachable");
        break;
    }
  }

  private int getUnreachableCondition() {
    return 0; // This ensures the switch condition is always false
  }
}