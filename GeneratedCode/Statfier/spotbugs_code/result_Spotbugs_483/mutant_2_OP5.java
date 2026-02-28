import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        x = -1;
        break;
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        y = "unreachable";
        break;
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        z = new String[]{"unreachable"};
        break;
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        z = new String[]{"unreachable"};
        break;
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        w = new Date(0);
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}