import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      u = null;
    } else {
      // This block will always execute
      System.out.println("This else block is always executed.");
    }
    
    return u;
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}