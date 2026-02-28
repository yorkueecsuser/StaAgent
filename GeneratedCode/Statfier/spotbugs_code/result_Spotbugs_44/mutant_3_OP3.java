import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code here
      }
    }

    private boolean getCondition() {
      return false; // This will always return false, but it's not a compile-time constant
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    public void anotherMethod() {
      boolean condition = getAnotherCondition();
      if (condition) {
        // Some code here
      }
    }

    private boolean getAnotherCondition() {
      return false; // This will always return false, but it's not a compile-time constant
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    public void yetAnotherMethod() {
      boolean condition = getYetAnotherCondition();
      if (condition) {
        // Some code here
      }
    }

    private boolean getYetAnotherCondition() {
      return false; // This will always return false, but it's not a compile-time constant
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    public void finalMethod() {
      boolean condition = getFinalCondition();
      if (condition) {
        // Some code here
      }
    }

    private boolean getFinalCondition() {
      return false; // This will always return false, but it's not a compile-time constant
    }
  }
}