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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  void test2() throws InterruptedException {
    Thread.currentThread();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  @ExpectWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void test3() throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    while (!Thread.currentThread().interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test4() throws InterruptedException {
    Thread t = Thread.currentThread();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    while (!unknownThread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test5() throws InterruptedException {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable if statement
      System.out.println("This is unreachable");
    }
    while (!unknownThread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  @Override
  public void run() {
    try {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable if statement
        System.out.println("This is unreachable");
      }
      test1();
      test2();
      test3();
      test4();
    } catch (InterruptedException ie) {
      System.out.println("Oh, ok");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}