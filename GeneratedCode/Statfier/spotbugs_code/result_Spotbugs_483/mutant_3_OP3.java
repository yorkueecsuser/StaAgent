import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      x = -1; // This line is unreachable
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      y = "unreachable"; // This line is unreachable
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      z = new String[0]; // This line is unreachable
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      z = null; // This line is unreachable
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      w = new Date(0); // This line is unreachable
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}