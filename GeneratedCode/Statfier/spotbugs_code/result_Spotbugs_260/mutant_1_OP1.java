import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    String qwerasdf = "unusedVariable"; // Dead Store mutation
    return u;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}