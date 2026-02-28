import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_11_02 {

  int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
    this.x = x; // Duplicate assignment
  }

  public void incrementGood() {
    x++;
    x++; // Duplicate increment
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    x = x++; // Duplicate problematic assignment
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    x = ++x; // Duplicate problematic assignment
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    x = tmp; // Duplicate assignment
  }
}