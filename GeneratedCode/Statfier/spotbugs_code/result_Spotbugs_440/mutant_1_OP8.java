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

  // Mutated code starts here

  int y;

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public void incrementGoodMutant() {
    y++;
  }

  @ExpectWarning("SA")
  public void incrementBad1Mutant() {
    y = y++;
  }

  @ExpectWarning("SA")
  public void incrementBad2Mutant() {
    y = ++y;
  }

  @ExpectWarning("SA")
  public void badMutant() {
    int z = y;
    y = z;
  }
}