import edu.umd.cs.findbugs.annotations.ExpectWarning;
import javax.annotation.CheckForNull;

class Ideas_2012_11_28<T> {

  public void doit(@CheckForNull T t) {}

  static class Subclass extends Ideas_2012_11_28<String> {

    @Override
    @ExpectWarning("NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE")
    public void doit(String s) {
      // Introduced an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop will never execute because conditionWhile is always false
        System.out.println("This is an unreachable loop");
      }
      
      System.out.println(s.hashCode());
    }

    private boolean getCondition() {
      return false;
    }
  }
}