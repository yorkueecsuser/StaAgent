import javax.annotation.CheckForNull;

class Ideas_2009_07_26 {
  int x;

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass()!= Ideas_2009_07_26.class) return false;
    Ideas_2009_07_26 other = (Ideas_2009_07_26) obj;
    if (x!= other.x) return false;
    
    // Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will never return true
      System.out.println("This is an unreachable statement");
    }
    
    return true;
  }

  public static int getHash(@CheckForNull Object o) {
    return o.hashCode();
  }

  public Ideas_2009_07_26(int x) {
    this.x = x;
  }

  @Override
  public int hashCode() {
    return x;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}