import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      x = -1;
    } else {
      // Alternative code that will always execute
      x = a;
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      y = "unreachable";
    } else {
      // Alternative code that will always execute
      y = b;
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      z = new String[]{"unreachable"};
    } else {
      // Alternative code that will always execute
      z = c;
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      z = new String[]{"unreachable"};
    } else {
      // Alternative code that will always execute
      z = c;
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never execute because shouldRun is always false
      w = new Date(0);
    } else {
      // Alternative code that will always execute
      w = d;
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if branch unreachable
  }
}