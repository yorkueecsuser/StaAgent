import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {
    int dummy = 0; // Introduced for mutation purposes
    int dummy2 = dummy; // Introduced for mutation purposes
    int dummy2Copy = dummy; // Mutation: duplicated assignment
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    int anotherDummy = 1; // Introduced for mutation purposes
    int anotherDummyCopy = anotherDummy; // Mutation: duplicated assignment
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {
    int yetAnotherDummy = 2; // Introduced for mutation purposes
    int yetAnotherDummyCopy = yetAnotherDummy; // Mutation: duplicated assignment
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    int finalDummy = 3; // Introduced for mutation purposes
    int finalDummyCopy = finalDummy; // Mutation: duplicated assignment
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {
    int serialDummy = 4; // Introduced for mutation purposes
    int serialDummyCopy = serialDummy; // Mutation: duplicated assignment
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    int serialAnotherDummy = 5; // Introduced for mutation purposes
    int serialAnotherDummyCopy = serialAnotherDummy; // Mutation: duplicated assignment
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {
    int serialYetAnotherDummy = 6; // Introduced for mutation purposes
    int serialYetAnotherDummyCopy = serialYetAnotherDummy; // Mutation: duplicated assignment
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    int serialFinalDummy = 7; // Introduced for mutation purposes
    int serialFinalDummyCopy = serialFinalDummy; // Mutation: duplicated assignment
  }
}