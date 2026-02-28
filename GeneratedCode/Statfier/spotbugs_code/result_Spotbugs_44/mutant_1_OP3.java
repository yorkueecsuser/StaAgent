import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {
    public void someMethod() {
      boolean condition = getCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    public void anotherMethod() {
      boolean condition = getAnotherCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getAnotherCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {
    public void yetAnotherMethod() {
      boolean condition = getYetAnotherCondition();
      if (condition) {
        // Some code
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
      boolean condition = getDifferentCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getDifferentCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {
    public void serializableMethod() {
      boolean condition = getSerializableCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getSerializableCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    public void subSerializableMethod() {
      boolean condition = getSubSerializableCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getSubSerializableCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {
    public void subWithoutSerializableMethod() {
      boolean condition = getSubWithoutSerializableCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getSubWithoutSerializableCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    public void subSubSerializableMethod() {
      boolean condition = getSubSubSerializableCondition();
      if (condition) {
        // Some code
      }
    }

    private boolean getSubSubSerializableCondition() {
      return false;
    }
  }
}