import java.lang.reflect.Method;

class Bug1912994 {
  public String foo() throws Exception {
    String s = null;
    try {
      Method m = this.getClass().getMethod("foo");
      m.invoke(this);
      char[] t = new char[0];
      t[1] = 'a';
      s = "foo";
      s += "bar";
      // Thread.sleep(100);
      return s;
    } catch (Exception e) { // Should yield "L D REC"
      throw new Exception(e);
    }
  }

  // If you comment out the following method, no "L D REC" warning is
  // emitted for line 17
  public String foo2() throws Exception {
    String x = null; // Renamed variable's' to 'x'
    try {
      Method m = this.getClass().getMethod("foo2");
      m.invoke(this);
      char[] y = new char[0]; // Renamed variable 't' to 'y'
      y[1] = 'a';
      x = "foo";
      x += "bar";
      // Thread.sleep(100);
      return x;
    } catch (RuntimeException re) {
      throw re;
    } catch (Exception e) {
      throw new Exception(e);
    }
  }
}