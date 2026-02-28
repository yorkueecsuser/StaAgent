import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {
    public void someMethod() {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    public void anotherMethod() {
      boolean conditionWhile = getAnotherCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getAnotherCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {
    public void yetAnotherMethod() {
      boolean conditionWhile = getYetAnotherCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getYetAnotherCondition() {
      return false;
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    public void differentMethod() {
      boolean conditionWhile = getDifferentCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getDifferentCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {
    public void serializableMethod() {
      boolean conditionWhile = getSerializableCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getSerializableCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    public void serializableSubMethod() {
      boolean conditionWhile = getSerializableSubCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getSerializableSubCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {
    public void serializableSubWithoutMethod() {
      boolean conditionWhile = getSerializableSubWithoutCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getSerializableSubWithoutCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    public void serializableSubSubMethod() {
      boolean conditionWhile = getSerializableSubSubCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getSerializableSubSubCondition() {
      return false;
    }
  }
}