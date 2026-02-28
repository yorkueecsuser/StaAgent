import java.util.Map;

class IntHolder {
  int value;
}

class Ser implements java.io.Serializable {
  private IntHolder holder = new IntHolder();

  private Map m;

  public void set(int v) {
    holder.value = v;
    
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will execute if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // This block is unreachable because shouldRun is always false
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}