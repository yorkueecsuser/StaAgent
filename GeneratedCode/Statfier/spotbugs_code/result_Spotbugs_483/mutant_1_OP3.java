import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      x = -1;
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      y = "unreachable";
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = new String[]{"unreachable"};
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      z = new String[]{"unreachable"};
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      w = new Date(0);
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if statements unreachable
  }
}