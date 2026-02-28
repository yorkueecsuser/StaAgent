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
  }

  void test2() throws InterruptedException {
    Thread.currentThread();
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  @ExpectWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void test3() throws InterruptedException {
    while (!Thread.currentThread().interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
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
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void test5() throws InterruptedException {
    while (!unknownThread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
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

  // Mutated code
  private Thread x; // Renamed 'unknownThread' to 'x'

  public UselessCurrentThread(Thread y) { // Renamed 't' to 'y'
    x = y;
  }

  @NoWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void a() throws InterruptedException { // Renamed 'test1' to 'a'
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  void b() throws InterruptedException { // Renamed 'test2' to 'b'
    Thread.currentThread();
    while (!Thread.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  @ExpectWarning("STI_INTERRUPTED_ON_CURRENTTHREAD")
  void c() throws InterruptedException { // Renamed 'test3' to 'c'
    while (!Thread.currentThread().interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void d() throws InterruptedException { // Renamed 'test4' to 'd'
    Thread z = Thread.currentThread(); // Renamed 't' to 'z'
    while (!x.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  // XXX no warning with ecj (Eclipse) compiler (bad)
  @DesireWarning("STI_INTERRUPTED_ON_UNKNOWNTHREAD")
  void e() throws InterruptedException { // Renamed 'test5' to 'e'
    while (!x.interrupted()) {
      System.out.println("huh?");
      Thread.sleep(10000);
    }
  }

  @Override
  public void f() { // Renamed 'run' to 'f'
    try {

      a();
      b();
      c();
      d();

    } catch (InterruptedException ie) {
      System.out.println("Oh, ok");
    }
  }
}