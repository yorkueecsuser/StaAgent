import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.SuspiciousThreadInterrupted;

@DetectorUnderTest(SuspiciousThreadInterrupted.class)
class UselessCurrentThread implements Runnable {
  private Thread unknownThread;

  public UselessCurrentThread(Thread t) {
    unknownThread = t;
  }

  @NoWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void test1() throws InterruptedException {
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
    } else {
      // This else block is unreachable
    }
  }

  void test2() throws InterruptedException {
    Thread.currentThread();
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
    } else {
      // This else block is unreachable
    }
  }

  @ExpectWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void test3() throws InterruptedException {
    while (!Thread.currentThread().interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
    } else {
      // This else block is unreachable
    }
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test4() throws InterruptedException {
    Thread t = Thread.currentThread();
    while (!unknownThread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
    } else {
      // This else block is unreachable
    }
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test5() throws InterruptedException {
    while (!unknownThread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if-else statement
    } else {
      // This else block is unreachable
    }
  }

  @Override
  public void run() {
    try {
      test1();
      test2();
      test3();
      test4();
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if-else statement
      } else {
        // This else block is unreachable
      }
    } catch (InterruptedException ie) {
      System.out.println("Oh, ok");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}