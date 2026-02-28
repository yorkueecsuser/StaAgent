import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      x = -1; // This line will never be executed
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      y = "unreachable"; // This line will never be executed
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      z = new String[0]; // This line will never be executed
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      z = new String[]{"unreachable"}; // This line will never be executed
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      w = new Date(0); // This line will never be executed
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}