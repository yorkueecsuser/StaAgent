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
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    public void anotherMethod() {
      boolean conditionFor = getAnotherCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }

    private boolean getAnotherCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    public void yetAnotherMethod() {
      boolean conditionFor = getYetAnotherCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }

    private boolean getYetAnotherCondition() {
      return false;
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    public void finalMethod() {
      boolean conditionFor = getFinalCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is intended to be unreachable
      }
    }

    private boolean getFinalCondition() {
      return false;
    }
  }
}