import codetoanalyze.java.annotation.Expensive;
import codetoanalyze.java.annotation.PerformanceCritical;

public interface ExpensiveInterfaceExample {

  interface I {

    @PerformanceCritical
    public void m1();

    public void m2();
  }

  class C {

    public void m3() {}

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
    }
  }

  // Mutants
  interface J {

    @PerformanceCritical
    public void n1();

    public void n2();
  }

  class D {

    public void n3() {}

    public void n4() {}
  }

  @Expensive
  public void n5();

  interface J2 extends J {
    @PerformanceCritical
    void n3();
  }

  abstract class ImplementsInterface2 implements J2 {

    @Expensive
    void cheap() {}

    @Override
    public void n1() {
      cheap();
    }
  }
}