import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.ByteArrayInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

class BadResultSetAccessTest {
  @ExpectWarning("SQL")
  public void test0(ResultSet rs) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int numCols = rsmd.getColumnCount();

    for (int i = 0; i < numCols; i++) {
      System.out.print("i = [" + i + "]  ");
      String s = rs.getString(i);
      System.out.println(s);
    }

    // Mutant
    int a = numCols;
    for (int b = 0; b < a; b++) {
      System.out.print("b = [" + b + "]  ");
      String t = rs.getString(b);
      System.out.println(t);
    }
  }

  @NoWarning("SQL")
  public void test01(ResultSet rs, int n) throws SQLException {
    int i;
    for (i = 0; i < n; i++) System.out.println(i);

    for (i = 1; i < n; i++) {
      rs.getString(i);
    }

    // Mutant
    int c = n;
    for (int d = 1; d < c; d++) {
      rs.getString(d);
    }
  }

  @ExpectWarning("SQL")
  public void test0noloop(ResultSet rs) throws SQLException {
    ResultSetMetaData rsmd = rs.getMetaData();
    int numCols = rsmd.getColumnCount();

    if (numCols > 0) {
      String s = rs.getString(0); // error: first column is 1
      System.out.println(s);
    }

    // Mutant
    int e = numCols;
    if (e > 0) {
      String f = rs.getString(0); // error: first column is 1
      System.out.println(f);
    }
  }

  @ExpectWarning("SQL")
  public void test1(ResultSet rs) throws SQLException {
    int i = rs.getInt(0);
    i++;
    rs.updateInt(0, i);

    // Mutant
    int g = i;
    g++;
    rs.updateInt(0, g);
  }

  @ExpectWarning("SQL")
  public void test2(ResultSet rs) throws SQLException {
    String s = rs.getString(0);
    s = s.substring(1);
    rs.updateString(0, s);

    // Mutant
    String h = s;
    h = h.substring(1);
    rs.updateString(0, h);
  }

  @NoWarning("SQL")
  public void test3(ResultSet rs) throws SQLException {
    String s = rs.getString("foo");
    s = s.substring(1);
    rs.updateString("foo", s);

    // Mutant
    String j = s;
    j = j.substring(1);
    rs.updateString("foo", j);
  }

  @NoWarning("SQL")
  public void test4(ResultSet rs) throws SQLException {
    rs.updateBinaryStream(1, null, 0);

    // Mutant
    rs.updateBinaryStream(1, null, 0);
  }

  @NoWarning("SQL")
  public void test5(ResultSet rs) throws SQLException {
    // This is ok, but generated false positives at one time
    int idx = 0;
    int rowId = rs.getInt(++idx);
    String name = rs.getString(++idx);
    String value = rs.getString(++idx);
    int groupId = rs.getInt(++idx);
    String description = rs.getString(++idx);

    // Mutant
    int k = idx;
    int l = rs.getInt(++k);
    String m = rs.getString(++k);
    String n = rs.getString(++k);
    int o = rs.getInt(++k);
    String p = rs.getString(++k);
  }

  @ExpectWarning("SQL")
  public void test6(ResultSet rs, boolean get1) throws SQLException {
    String name = rs.getString(get1? 1 : 0);

    // Mutant
    String q = rs.getString(get1? 1 : 0);
  }

  @ExpectWarning("SQL")
  public void test7(PreparedStatement ps) throws SQLException {
    ps.setAsciiStream(0, new ByteArrayInputStream(new byte[0]), 0);

    // Mutant
    ps.setAsciiStream(0, new ByteArrayInputStream(new byte[0]), 0);
  }

  @ExpectWarning("SQL")
  public void test8(ResultSet rs, boolean get0) throws SQLException {
    String name = rs.getString(get0? 0 : 1);

    // Mutant
    String r = rs.getString(get0? 0 : 1);
  }
}