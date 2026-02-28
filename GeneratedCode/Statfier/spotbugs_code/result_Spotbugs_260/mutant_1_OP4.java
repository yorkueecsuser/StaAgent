import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Mutant code start
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable if block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is an unreachable else block");
    }
    // Mutant code end
    
    return u;
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always false
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}