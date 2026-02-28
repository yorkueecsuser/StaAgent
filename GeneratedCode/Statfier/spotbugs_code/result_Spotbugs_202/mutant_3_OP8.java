import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class DMI_INVOKING_HASHCODE_ON_ARRAY {

  /*
   * Entities: v1: int [] o1: invoke int [].hashCode v2: int Connections: o1
   * is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(int[] any) {
    any.hashCode();
  }

  // Mutant with renamed variable
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void buga(int[] bny) {
    bny.hashCode();
  }

  /*
   * Entities: v1: Object [] o1: invoke Object [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(Object[] any) {
    any.hashCode();
  }

  // Mutant with renamed variable
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bugb(Object[] bny) {
    bny.hashCode();
  }

  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(long[] any) {
    any.hashCode();
  }

  // Mutant with renamed variable
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bugc(long[] bny) {
    bny.hashCode();
  }

  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBug(Object any) {
    any.hashCode();
  }

  // Mutant with renamed variable
  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBugb(Object bny) {
    bny.hashCode();
  }
}