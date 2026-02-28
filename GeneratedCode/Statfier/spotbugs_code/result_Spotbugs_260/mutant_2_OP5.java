import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        System.out.println("This is an unreachable case");
        break;
      default:
        // This is the default case
        System.out.println("This is the default case");
        break;
    }
    
    return u;
  }

  private boolean getAlwaysFalse() {
    return false;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}