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
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
  }

  // Mutated code
  int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void incrementGood2() {
    y++;
  }

  @ExpectWarning("SA")
  public void incrementBad1b() {
    y = y++;
  }

  @ExpectWarning("SA")
  public void incrementBad2b() {
    y = ++y;
  }

  @ExpectWarning("SA")
  public void bad2() {
    int z = y;
    y = z;
  }
}