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
      setRandom(new Random()); // Mutant: duplicated assignment
    }
    return random;
  }

  void setRandom(Random random) {
    this.random = random;
    this.random = random; // Mutant: duplicated assignment
  }

  public String getRandomString(final String label) {
    return "-= random " + label + ": " + getRandom().nextInt(10000) + " =-";
  }
}