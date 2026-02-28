import java.util.Map;

class IntHolder {
  int value;
}

class Ser implements java.io.Serializable {
  private IntHolder holder = new IntHolder();

  private Map m;

  public void set(int v) {
    holder.value = v;
    
    // Introduced an unreachable if statement based on the mutation operator description
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}