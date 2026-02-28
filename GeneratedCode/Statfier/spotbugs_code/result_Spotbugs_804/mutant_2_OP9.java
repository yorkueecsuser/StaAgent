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
    do {
      System.out.println("huh?");
      Thread.sleep(10000);
    } while (!Thread.interrupted());
  }

  void test2() throws InterruptedException {
    Thread.currentThread();
    do {
      System.out.println("huh?");
      Thread.sleep(10000);
    } while (!Thread.interrupted());
  }

  @ExpectWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void test3() throws InterruptedException {
    do {
      System.out.println("huh?");
      Thread.sleep(10000);
    } while (!Thread.currentThread().interrupted());
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test4() throws InterruptedException {
    Thread t = Thread.currentThread();
    do {
      System.out.println("huh?");
      Thread.sleep(10000);
    } while (!unknownThread.interrupted());
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test5() throws InterruptedException {
    do {
      System.out.println("huh?");
      Thread.sleep(10000);
    } while (!unknownThread.interrupted());
  }

  @Override
  public void run() {
    try {

      test1();
      test2();
      test3();
      test4();

    } catch (InterruptedException ie) {
      System.out.println("Oh, ok");
    }
  }
}