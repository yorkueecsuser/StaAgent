import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {
    String abcdefgh = "unusedVariable"; // Dead Store mutation
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    int ijklmnop = 42; // Dead Store mutation
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {
    boolean nopqrstu = true; // Dead Store mutation
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    double stuvwxyz = 3.14; // Dead Store mutation
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {
    char vwxyzabc = 'x'; // Dead Store mutation
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    float cdefghij = 2.71f; // Dead Store mutation
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {
    long klmnopqr = 123456789L; // Dead Store mutation
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    short stuvwxxy = 123; // Dead Store mutation
  }
}