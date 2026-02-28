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
      int x = 5; // Introduced for mutation
      int x = 5; // Duplicate of the above line
    }

    public void m4() {
      boolean flag = true; // Introduced for mutation
      boolean flag = true; // Duplicate of the above line
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
      double value = 3.14; // Introduced for mutation
      double value = 3.14; // Duplicate of the above line
    }

    @Override
    public void m1() {
      expensive();
    }
  }
}