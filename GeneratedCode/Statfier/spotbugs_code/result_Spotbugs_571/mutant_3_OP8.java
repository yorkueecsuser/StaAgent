import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3277814 {

  @NoWarning("NP")
  public void test() {
    String var = "";
    int index = 2;
    if (index == -1) {
      var = String.class.getName();
      if (var.length() == 0) {
        var = null;
      }
    } else {
      var = Integer.class.getName();
      if (var.length() == 0) {
        var = null;
      }
    }
    if (var == null) { // FINBUGS reports on this line NP_GUARANTEED_DEREF
      /*
       * There is a statement or branch that if executed guarantees that a
       * value is null at this point, and that value that is guaranteed to
       * be dereferenced (except on forward paths involving runtime
       * exceptions).
       */
      throw new RuntimeException("NULL");
    }

    // Mutated code
    String a = "";
    int b = 2;
    if (b == -1) {
      a = String.class.getName();
      if (a.length() == 0) {
        a = null;
      }
    } else {
      a = Integer.class.getName();
      if (a.length() == 0) {
        a = null;
      }
    }
    if (a == null) {
      throw new RuntimeException("NULL");
    }
  }

  @ExpectWarning("NP")
  public void test2() {
    String var = "";
    int index = 2;
    if (index == -1) {
      var = String.class.getName();
      if (var.length() == 0) {
        var = null;
      }
    } else {
      var = Integer.class.getName();
      if (var.length() == 0) {
        var = null;
      }
    }
    if (var == null) { // FINBUGS reports on this line NP_GUARANTEED_DEREF
      /*
       * There is a statement or branch that if executed guarantees that a
       * value is null at this point, and that value that is guaranteed to
       * be dereferenced (except on forward paths involving runtime
       * exceptions).
       */
      throw new NullPointerException("var is null");
    }

    // Mutated code
    String c = "";
    int d = 2;
    if (d == -1) {
      c = String.class.getName();
      if (c.length() == 0) {
        c = null;
      }
    } else {
      c = Integer.class.getName();
      if (c.length() == 0) {
        c = null;
      }
    }
    if (c == null) {
      throw new NullPointerException("var is null");
    }
  }
}