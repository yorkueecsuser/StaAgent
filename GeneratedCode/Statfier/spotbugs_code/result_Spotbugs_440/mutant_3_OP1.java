import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_11_02 {

  int x;

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
    // Dead Store Mutation
    String jvbnrhty = "unused";
  }

  public void incrementGood() {
    x++;
    // Dead Store Mutation
    int qwerasdf = 42;
  }

  @ExpectWarning("SA")
  public void incrementBad1() {
    x = x++;
    // Dead Store Mutation
    boolean zxcvbnml = true;
  }

  @ExpectWarning("SA")
  public void incrementBad2() {
    x = ++x;
    // Dead Store Mutation
    double poiuytrewq = 3.14;
  }

  @ExpectWarning("SA")
  public void bad() {
    int tmp = x;
    x = tmp;
    // Dead Store Mutation
    char asdfghjk = 'a';
  }
}