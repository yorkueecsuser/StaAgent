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
    return random;
  }

  void setRandom(Random random) {
    this.random = random;
  }

  public String getRandomString(final String label) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
    
    return "-= random " + label + ": " + getRandom().nextInt(10000) + " =-";
  }

  private boolean getCondition() {
    // This method always returns false, making the loop condition always false
    return false;
  }
}