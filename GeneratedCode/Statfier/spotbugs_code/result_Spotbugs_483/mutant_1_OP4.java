import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = a + 1; // This line is unreachable because shouldRun is always false
    } else {
      x = a - 1;
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      y = b + "extra"; // This line is unreachable because shouldRun is always false
    } else {
      y = b;
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      z = new String[]{"unreachable"}; // This line is unreachable because shouldRun is always false
    } else {
      z = c;
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      z = new String[]{"unreachable"}; // This line is unreachable because shouldRun is always false
    } else {
      z = c;
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      w = new Date(0); // This line is unreachable because shouldRun is always false
    } else {
      w = d;
    }
  }

  // Helper method to ensure the condition is dynamically determined at runtime
  private boolean getCondition() {
    return false;
  }
}