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
    int temp = any.length; // Added unique duplication of an assignment statement
    int tempCopy = any.length; // Duplicated assignment statement
  }

  /*
   * Entities: v1: Object [] o1: invoke Object [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(Object[] any) {
    any.hashCode();
    int length = any.length; // Added unique duplication of an assignment statement
    int lengthCopy = any.length; // Duplicated assignment statement
  }

  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(long[] any) {
    any.hashCode();
    int arrayLength = any.length; // Added unique duplication of an assignment statement
    int arrayLengthCopy = any.length; // Duplicated assignment statement
  }

  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBug(Object any) {
    any.hashCode();
    String className = any.getClass().getName(); // Added unique duplication of an assignment statement
    String classNameCopy = any.getClass().getName(); // Duplicated assignment statement
  }
}