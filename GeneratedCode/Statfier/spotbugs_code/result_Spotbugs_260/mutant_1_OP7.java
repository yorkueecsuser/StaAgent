import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Introduced an unreachable while loop with a dynamic condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    return u;
  }

  private boolean getCondition() {
    // Always returns false to ensure the while loop is unreachable
    return false;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}