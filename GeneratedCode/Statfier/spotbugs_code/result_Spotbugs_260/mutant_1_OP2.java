import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    URL u_duplicate = this.getClass().getResource(""); // Duplicate assignment without method invocation
    return u;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }
}