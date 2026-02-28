import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.Assert;

/**
 * More eclipse Null pointer false positives
 *
 * <p>From https://bugs.eclipse.org/bugs/show_bug.cgi?id=195638
 */
class Ideas_2010_04_29 {

  @ExpectWarning("NP_NULL_ON_SOME_PATH_EXCEPTION")
  @NoWarning("NP_ALWAYS_NULL,NP_NULL_ON_SOME_PATH")
  public void test1() {
    String str = null;
    for (int i = 0; i < 2; i++) {
      try {
        str = new String("Test");
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      str.charAt(i);
      // Eclipse Error : "Null pointer access: The
      // variable str can only be null at
      // this location"
      str = null;
    }
    // Mutant
    String a = null;
    for (int b = 0; b < 2; b++) {
      try {
        a = new String("Test");
      } catch (Exception c) {
        c.printStackTrace();
      }
      a.charAt(b);
      a = null;
    }
  }

  @NoWarning("NP")
  public void test2() {
    String str = null;
    for (int i = 0; i < 2; i++) {
      try {
        str = new String("Test");
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      str.charAt(i);
      // Error : "Null pointer access: The
      // variable str can only be null at
      // this location"

    }
    // Mutant
    String x = null;
    for (int y = 0; y < 2; y++) {
      try {
        x = new String("Test");
      } catch (Exception z) {
        z.printStackTrace();
      }
      x.charAt(y);
    }
  }

  static class Test3 {

    @NoWarning("NP_ALWAYS_NULL,NP_NULL_ON_SOME_PATH")
    void m() throws SQLException {
      Connection conn = null;
      try {
        conn = createConnection();

        for (; ; ) {
          throwSomething();
        }
      } catch (MyException e) {
        conn.rollback(); // The variable can never be null here...
      }
    }

    private void throwSomething() throws MyException {
      throw new MyException();
    }

    class MyException extends Exception {}

    private Connection createConnection() throws SQLException {
      return DriverManager.getConnection("", "", "");
    }
    // Mutant
    void n() throws SQLException {
      Connection d = null;
      try {
        d = createConnection();

        for (; ; ) {
          throwSomething();
        }
      } catch (MyException f) {
        d.rollback(); // The variable can never be null here...
      }
    }
  }

  @NoWarning("NP_ALWAYS_NULL,NP_NULL_ON_SOME_PATH")
  public void test4() {
    String dummy = null;
    for (int i = 0; i < 10; i++) {
      if (i % 2!= 0) {
        dummy = "Foo";
      }
      System.out.println("Hello");
      if (i % 2!= 0) {
        System.out.println(dummy.toLowerCase());
      }
      dummy = null;
    }
    // Mutant
    String g = null;
    for (int h = 0; h < 10; h++) {
      if (h % 2!= 0) {
        g = "Foo";
      }
      System.out.println("Hello");
      if (h % 2!= 0) {
        System.out.println(g.toLowerCase());
      }
      g = null;
    }
  }

  public void test4a() {
    String dummy = null;
    for (int i = 0; i < 10; i++) {
      if (i % 2!= 0) {
        dummy = "Foo";
      }
      System.out.println("Hello");
      if (dummy!= null && i % 2!= 0) {
        System.out.println(dummy.toLowerCase());
      }
      dummy = null;
    }
    // Mutant
    String j = null;
    for (int k = 0; k < 10; k++) {
      if (k % 2!= 0) {
        j = "Foo";
      }
      System.out.println("Hello");
      if (j!= null && k % 2!= 0) {
        System.out.println(j.toLowerCase());
      }
      j = null;
    }
  }

  @NoWarning("NP_ALWAYS_NULL")
  private void test5() {
    String tblVarRpl = null;
    while (true) {
      boolean isOpenVariableMortageRateProduct = true;
      boolean tblVarRplAllElementAddedIndicator = false;
      if (isOpenVariableMortageRateProduct) {
        if (tblVarRplAllElementAddedIndicator == false) tblVarRpl = "";
        tblVarRpl = tblVarRpl.substring(1); // Can only be null???
        return;
      }
    }
    // Mutant
    String l = null;
    while (true) {
      boolean m = true;
      boolean n = false;
      if (m) {
        if (n == false) l = "";
        l = l.substring(1); // Can only be null???
        return;
      }
    }
  }

  @NoWarning("NP_ALWAYS_NULL,NP_NULL_ON_SOME_PATH")
  public void test8(boolean fail) throws Exception {
    Object v = null;
    try {
      try {
        v = "Hello";
      } finally {
        if (fail) throw new IOException();
      }
    } catch (IOException e) {
      Assert.assertEquals("Hello", v.toString());
    }
    // Mutant
    Object p = null;
    try {
      try {
        p = "Hello";
      } finally {
        if (fail) throw new IOException();
      }
    } catch (IOException q) {
      Assert.assertEquals("Hello", p.toString());
    }
  }

  @ExpectWarning("NP_LOAD_OF_KNOWN_NULL_VALUE")
  void test9(boolean b) {
    Object o = null;
    for (int i = 0; i < 25; i++) {
      if (b) {
        if (o == null) { // should report always null
          o = new Object();
        }
        return;
      }
    }
    // Mutant
    Object r = null;
    for (int s = 0; s < 25; s++) {
      if (b) {
        if (r == null) { // should report always null
          r = new Object();
        }
        return;
      }
    }
  }
}