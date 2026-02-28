import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    // Mutant code added here
    String qzjfnrvt = "unusedVariable";
    return u;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}