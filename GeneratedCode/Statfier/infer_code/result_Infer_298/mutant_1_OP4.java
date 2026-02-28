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
      if (condition) {
        // Some code
      } else {
        // Unreachable else block
        System.out.println("This is an unreachable else block in m3");
      }
    }

    public void m4() {}
  }

  @Expensive
  public void m5();

  interface I2 extends I {
    @PerformanceCritical
    void m3();
  }

  abstract class ImplementsInterface implements I2 {

    @Expensive
    void expensive() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else block
        System.out.println("This is an unreachable else block in expensive");
      }
    }

    @Override
    public void m1() {
      expensive();
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return true; // This can be any logic that determines the condition at runtime
  }
}