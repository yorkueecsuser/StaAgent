import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Ideas_2012_11_28<T> {

  public void doit(@CheckForNull T t) {}

  static class Subclass extends Ideas_2012_11_28<String> {

    @Override
    @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public void doit(String s) {
      System.out.println(s.hashCode());

      // Inserting an unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is always false
          System.out.println("This is an unreachable case");
          break;
        default:
          // This is the reachable case
          System.out.println("This is the reachable default case");
          break;
      }
    }

    private boolean getCondition() {
      // This method always returns false, making the switch condition always evaluate to 1
      return false;
    }
  }
}