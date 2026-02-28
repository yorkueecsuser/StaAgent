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
        System.out.println("This is an unreachable else block in SubClassWithDuplicate");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
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
        System.out.println("This is an unreachable else block in SubSubClassWithDuplicate");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
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
        System.out.println("This is an unreachable else block in SerializableSubClassWithDuplicate");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
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
        System.out.println("This is an unreachable else block in SerializableSubSubClassDuplicate");
      }
    }

    private boolean getCondition() {
      return true; // Always returns true to ensure the else block is unreachable
    }
  }
}