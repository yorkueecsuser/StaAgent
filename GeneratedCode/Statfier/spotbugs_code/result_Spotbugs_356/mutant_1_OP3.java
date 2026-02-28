import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class Ideas_2011_12_11 {

  final CountDownLatch latch = new CountDownLatch(1);

  public void waitForIt() throws TimeoutException, InterruptedException {
    latch.await(5, TimeUnit.SECONDS);
    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement.");
    }
  }

  public void countDown() {
    latch.countDown();
    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is another unreachable statement.");
    }
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}