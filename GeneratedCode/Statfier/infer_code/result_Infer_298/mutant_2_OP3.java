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
        // Some code that should run if condition is true
      }
    }

    public void m4() {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should run if condition is true
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
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
    void expensive() {
      boolean condition = getCondition();
      if (condition) {
        // Some code that should run if condition is true
      }
    }

    @Override
    public void m1() {
      expensive();
      boolean condition = getCondition();
      if (condition) {
        // Some code that should run if condition is true
      }
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
    }
  }
}