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
        // Some code
      } else {
        // Unreachable else block
      }
    }

    private boolean getCondition() {
      return false; // This ensures the condition is dynamically determined but always false
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else block
      }
    }

    private boolean getCondition() {
      return false; // This ensures the condition is dynamically determined but always false
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else block
      }
    }

    private boolean getCondition() {
      return false; // This ensures the condition is dynamically determined but always false
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      } else {
        // Unreachable else block
      }
    }

    private boolean getCondition() {
      return false; // This ensures the condition is dynamically determined but always false
    }
  }
}