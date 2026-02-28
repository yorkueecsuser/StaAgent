import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      x = a + 1; // This branch is logically unreachable if getCondition() always returns false
    } else {
      x = a - 1; // Alternative code that is also unreachable
    }
  }

  public void g(int a, String b, String[] c) {
    y = b;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      y = b + "suffix"; // This branch is logically unreachable if getCondition() always returns false
    } else {
      y = b + "prefix"; // Alternative code that is also unreachable
    }
  }

  public void h(int a, String b, String[] c) {
    z = c;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      z = new String[]{"unreachable"}; // This branch is logically unreachable if getCondition() always returns false
    } else {
      z = new String[]{"also unreachable"}; // Alternative code that is also unreachable
    }
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      z = new String[]{"unreachable"}; // This branch is logically unreachable if getCondition() always returns false
    } else {
      z = new String[]{"also unreachable"}; // Alternative code that is also unreachable
    }
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      w = new Date(0); // This branch is logically unreachable if getCondition() always returns false
    } else {
      w = new Date(1); // Alternative code that is also unreachable
    }
  }

  // Helper method to simulate a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically at runtime
  }
}