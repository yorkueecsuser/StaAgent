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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for int array");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for int array");
    }
  }

  /*
   * Entities: v1: Object [] o1: invoke Object [].hashCode v2: int
   * Connections: o1 is invoked on v1 v2 is the result of o1
   */
  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(Object[] any) {
    any.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for Object array");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for Object array");
    }
  }

  @ExpectWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void bug(long[] any) {
    any.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for long array");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for long array");
    }
  }

  @NoWarning("DMI_INVOKING_HASHCODE_ON_ARRAY")
  void notBug(Object any) {
    any.hashCode();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should never run
      System.out.println("This should never print for Object");
    } else {
      // Alternative code that should also never run
      System.out.println("This alternative should also never print for Object");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}