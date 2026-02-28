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

  // Mutant: Renamed variable's' to 'x'
  public String foo2() throws Exception {
    String x = null;
    try {
      Method m = this.getClass().getMethod("foo2");
      m.invoke(this);
      char[] y = new char[0];
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