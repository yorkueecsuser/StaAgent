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

  // Mutated version of foo method
  public String fooM() throws Exception {
    String x = null;
    try {
      Method n = this.getClass().getMethod("fooM");
      n.invoke(this);
      char[] y = new char[0];
      y[1] = 'a';
      x = "foo";
      x += "bar";
      // Thread.sleep(100);
      return x;
    } catch (Exception e) { // Should yield "L D REC"
      throw new Exception(e);
    }
  }

  // If you comment out the following method, no "L D REC" warning is
  // emitted for line 17
  public String foo2() throws Exception {
    String s = null;
    try {
      Method m = this.getClass().getMethod("foo2");
      m.invoke(this);
      char[] t = new char[0];
      t[1] = 'a';
      s = "foo";
      s += "bar";
      // Thread.sleep(100);
      return s;
    } catch (RuntimeException re) {
      throw re;
    } catch (Exception e) {
      throw new Exception(e);
    }
  }

  // Mutated version of foo2 method
  public String foo2M() throws Exception {
    String z = null;
    try {
      Method p = this.getClass().getMethod("foo2M");
      p.invoke(this);
      char[] q = new char[0];
      q[1] = 'a';
      z = "foo";
      z += "bar";
      // Thread.sleep(100);
      return z;
    } catch (RuntimeException re) {
      throw re;
    } catch (Exception e) {
      throw new Exception(e);
    }
  }
}