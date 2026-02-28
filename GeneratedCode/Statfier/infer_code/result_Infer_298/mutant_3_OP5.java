import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

public interface ExpensiveInterfaceExample {

  interface I {

    @PerformanceCritical
    public void m1();

    public void m2();
  }

  class C {

    public void m3() {
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0");
          break;
        case 1:
          // This is the reachable case
          System.out.println("Reachable case 1");
          break;
      }
    }

    public void m4() {}

    private boolean getCondition() {
      return false;
    }
  }

  @Expensive
  public void m5();

  interface I2 extends I {
    @PerformanceCritical
    void m3();
  }

  abstract class ImplementsInterface implements I2 {

    @Expensive
    void expensive() {}

    @Override
    public void m1() {
      expensive();
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          System.out.println("Unreachable case 0 in ImplementsInterface");
          break;
        case 1:
          // This is the reachable case
          System.out.println("Reachable case 1 in ImplementsInterface");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}