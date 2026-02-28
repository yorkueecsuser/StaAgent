import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_11_02 {

  int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void incrementGood() {
    x++;
    int qzjfnrht = 42; // Dead store
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    String lmwvbnxz = "unused"; // Dead store
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    double kxqjfnrj = 3.14; // Dead store
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    boolean vbnxqjfk = true; // Dead store
  }
}