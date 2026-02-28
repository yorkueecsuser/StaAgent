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
    String unusedVar1 = "abcdefgh"; // Dead Store
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "");
  }

  @ExpectWarning("DMI_CONSTANT_DB_PASSWORD")
  Connection getConnection2() throws SQLException {
    int unusedVar2 = 12345678; // Dead Store
    return DriverManager.getConnection("jdbc:hsqldb:mem:test", "sa", "secret");
  }

  @ExpectWarning("DMI_USELESS_SUBSTRING")
  String f(String s) {
    boolean unusedVar3 = true; // Dead Store
    return s.substring(0);
  }

  String g(String s) {
    char unusedVar4 = 'z'; // Dead Store
    for (int i = 0; i < s.length(); i++) if (s.substring(i).hashCode() == 42) return s;
    return null;
  }

  @Override
  @ExpectWarning("DMI_CALLING_NEXT_FROM_HASNEXT")
  public boolean hasNext() {
    double unusedVar5 = 3.14159265; // Dead Store
    return next()!= null;
  }

  @Override
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    long unusedVar6 = 987654321L; // Dead Store
    return null;
  }

  @Override
  public void remove() {
    short unusedVar7 = 32767; // Dead Store
  }

  public void falsePositive() {
    Date today = Calendar.getInstance().getTime();
    System.out.println(today);
    today.setDate(16);
    System.out.println(today);
    float unusedVar8 = 2.71828182f; // Dead Store
  }

  @ExpectWarning("DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT")
  double convertToDouble(int i) {
    byte unusedVar9 = 127; // Dead Store
    return Double.longBitsToDouble(i);
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile() {
    new File("c:\\test.txt");
    int unusedVar10 = 42; // Dead Store
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testFile2() {
    new File("c:\\temp", "test.txt");
    char[] unusedVar11 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}; // Dead Store
  }

  @ExpectWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream() throws IOException {
    new PrintStream("c:\\test.txt", "UTF-8");
    String unusedVar12 = "ijklmnop"; // Dead Store
  }

  @NoWarning("DMI_HARDCODED_ABSOLUTE_FILENAME")
  public void testPrintStream2() throws IOException {
    new PrintStream("UTF-8", "c:\\test.txt");
    boolean unusedVar13 = false; // Dead Store
  }
}