import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    x = a;
  }

  public void g(int a, String b, String[] c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    y = b;
  }

  public void h(int a, String b, String[] c) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    z = c;
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    z = c;
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    w = d;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}