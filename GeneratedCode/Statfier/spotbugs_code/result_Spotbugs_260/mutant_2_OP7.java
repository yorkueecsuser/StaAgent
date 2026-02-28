import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    return u;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}