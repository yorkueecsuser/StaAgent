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
    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
    return random;
  }

  void setRandom(Random random) {
    this.random = random;
  }

  public String getRandomString(final String label) {
    return "-= random " + label + ": " + getRandom().nextInt(10000) + " =-";
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return true; // Always returns true to ensure the if block is reachable
  }
}