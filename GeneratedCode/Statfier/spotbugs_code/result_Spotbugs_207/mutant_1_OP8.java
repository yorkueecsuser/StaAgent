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
    for (int j = 0; j < 2; j++) {
      try {
        a = new String("Test");
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      a.charAt(j);
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
    String b = null;
    for (int k = 0; k < 2; k++) {
      try {
        b = new String("Test");
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      b.charAt(k);
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
      Connection c = null;
      try {
        c = createConnection();

        for (; ; ) {
          throwSomething();
        }
      } catch (MyException e) {
        c.rollback();
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
    String e = null;
    for (int f = 0; f < 10; f++) {
      if (f % 2!= 0) {
        e = "Foo";
      }
      System.out.println("Hello");
      if (f % 2!= 0) {
        System.out.println(e.toLowerCase());
      }
      e = null;
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
    String g = null;
    for (int h = 0; h < 10; h++) {
      if (h % 2!= 0) {
        g = "Foo";
      }
      System.out.println("Hello");
      if (g!= null && h % 2!= 0) {
        System.out.println(g.toLowerCase());
      }
      g = null;
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
    String i = null;
    while (true) {
      boolean j = true;
      boolean k = false;
      if (j) {
        if (k == false) i = "";
        i = i.substring(1);
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
    Object l = null;
    try {
      try {
        l = "Hello";
      } finally {
        if (fail) throw new IOException();
      }
    } catch (IOException e) {
      Assert.assertEquals("Hello", l.toString());
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
    Object m = null;
    for (int n = 0; n < 25; n++) {
      if (b) {
        if (m == null) {
          m = new Object();
        }
        return;
      }
    }
  }
}