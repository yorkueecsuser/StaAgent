import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class DMI_INVOKING_HASHCODE_ON_ARRAY {

  /*
   * Entities: v1: int [] o1: invoke int [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(int[] any) {
    any.hashCode();
    // Mutant: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  /*
   * Entities: v1: Object [] o1: invoke Object [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(Object[] any) {
    any.hashCode();
    // Mutant: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(long[] any) {
    any.hashCode();
    // Mutant: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBug(Object any) {
    any.hashCode();
    // Mutant: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}