import java.util.Random;

/**
 * Helper methods useful in JUnit test implementations
 *
 * @author Piotr Swiecicki &lt;piotr.swiecicki@southyorks.pnn.police.uk&gt;
 */
class Bug2798271 {
  /** random number generated */
  private Random random;

  /**
   * get random number generator, lazily instantiated
   *
   * @return
   */
  public Random getRandom() {
    if (null == random) {
      setRandom(new Random());
    }
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code due to condition always being false.");
    }
    return random;
  }

  void setRandom(Random random) {
    this.random = random;
  }

  public String getRandomString(final String label) {
    return "-= random " + label + ": " + getRandom().nextInt(10000) + " =-";
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}