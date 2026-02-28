import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will always return false
    }
    
    return u;
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}