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
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  /*
   * Entities: v1: Object [] o1: invoke Object [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(Object[] any) {
    any.hashCode();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(long[] any) {
    any.hashCode();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBug(Object any) {
    any.hashCode();
    // Mutant: Unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's dynamically determined at runtime
  }
}