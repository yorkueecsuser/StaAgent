import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Introduced an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      u = null;
    } else {
      // This block will always execute
      System.out.println("This is the reachable else block");
    }
    
    return u;
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}