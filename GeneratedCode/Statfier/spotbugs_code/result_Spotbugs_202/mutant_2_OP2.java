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
    int temp = 0; // Added unique assignment statement
    int tempCopy = temp; // Duplicate of the above assignment
  }

  /*
   * Entities: v1: Object [] o1: invoke Object [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(Object[] any) {
    any.hashCode();
    int temp = 1; // Added unique assignment statement
    int tempCopy = temp; // Duplicate of the above assignment
  }

  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(long[] any) {
    any.hashCode();
    int temp = 2; // Added unique assignment statement
    int tempCopy = temp; // Duplicate of the above assignment
  }

  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBug(Object any) {
    any.hashCode();
    int temp = 3; // Added unique assignment statement
    int tempCopy = temp; // Duplicate of the above assignment
  }
}