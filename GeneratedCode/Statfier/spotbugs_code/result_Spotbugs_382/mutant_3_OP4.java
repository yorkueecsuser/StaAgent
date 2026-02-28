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

      // Mutant: Inserting an unreachable if-else statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is reachable code.");
      } else {
        System.out.println("This is unreachable code.");
      }
    }

    private boolean getCondition() {
      return true; // This ensures the if block is reachable and the else block is unreachable
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