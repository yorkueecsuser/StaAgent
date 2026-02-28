import java.net.URL;

class Bug2974855 {

  public URL test() {
    URL u = this.getClass().getResource("");
    return u;
  }

  public static void main(String args[]) {
    System.out.println(new Bug2974855().test());
  }

  // Mutated code
  public URL testMutant() {
    URL v = this.getClass().getResource("");
    return v;
  }

  public static void mainMutant(String args[]) {
    System.out.println(new Bug2974855().testMutant());
  }
}