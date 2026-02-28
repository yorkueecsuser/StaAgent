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
    int abcdefgh = 42; // Dead store
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    int ijklmnop = 99; // Dead store
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    int qrstuvwx = 77; // Dead store
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    int yzabcdef = 33; // Dead store
  }
}