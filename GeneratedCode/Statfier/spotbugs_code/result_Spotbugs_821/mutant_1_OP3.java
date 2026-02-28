import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

abstract class AbstractMissingHashCode {
  int x;

  @Override
  @ExpectWarning("HE_EQUALS_USE_HASHCODE")
  public boolean equals(Object o) {
    if (!(o instanceof AbstractMissingHashCode)) return false;
    return x == ((AbstractMissingHashCode) o).x;
  }

  @ExpectWarning("HE_INHERITS_EQUALS_USE_HASHCODE")
  static class StillMissingHashCode extends AbstractMissingHashCode {
    int y;
  }

  static class Concrete extends StillMissingHashCode {
    public int z;

    @Override
    @NoWarning("HE")
    public int hashCode() {
      return 0;
    }

    @ExpectWarning("EQ_UNUSUAL")
    @Override
    public boolean equals(Object o) {
      // #303 Request for check <int var> += <double val>
      int sum = 5;
      sum += 4.2; // same as sum = (int)(sum + 4.2);
      System.out.println(sum);

      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable branch");
      }

      return o == this;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
    }
  }

  @ExpectWarning("EQ_DOESNT_OVERRIDE_EQUALS")
  static class ConcreteMissingEquals extends Concrete {
    int z;
  }
}