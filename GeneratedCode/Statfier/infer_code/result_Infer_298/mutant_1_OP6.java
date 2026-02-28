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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
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
    void expensive() {}

    @Override
    public void m1() {
      expensive();
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }
  }

  private boolean getCondition() {
    return false;
  }
}