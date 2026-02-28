import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class Bug3483863 {

  interface IInterface1 {
    @Nonnull
    public Object get();
  }

  class CClass2 {

    @DesireNoWarning(value = "NP", confidence = Confidence.LOW)
    public void test(IInterface1 x) {
      Object a = x.get();
      System.out.println(a.toString());

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is an unreachable case");
          break;
        default:
          // Default case will also never be executed
          System.out.println("This is another unreachable case");
          break;
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  class CClass implements IInterface1 {

    @DesireWarning(value = "NP", confidence = Confidence.LOW)
    @Override
    @CheckForNull
    public Object get() {
      return null;
    }
  }

  interface IInterface2 extends IInterface1 {

    @Override
    @DesireWarning(value = "NP", confidence = Confidence.LOW)
    @CheckForNull
    public Object get();
  }
}