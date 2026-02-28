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
      // Inserting unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        System.out.println("This is an unreachable statement");
      }
      System.out.println(a.toString());
    }

    private boolean getUnreachableCondition() {
      return false; // This method will always return false, but it's not a compile-time constant
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