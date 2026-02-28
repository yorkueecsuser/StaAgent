import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {
    private int value;

    public SuperClass() {
      this.value = 10; // Original assignment
      this.value = 10; // Duplicated assignment
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    private int value;

    public SubClassWithDuplicate() {
      this.value = 20; // Original assignment
      this.value = 20; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {
    private int value;

    public SubClassWithoutDuplicate() {
      this.value = 30; // Original assignment
      this.value = 30; // Duplicated assignment
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    private int value;

    public SubSubClassWithDuplicate() {
      this.value = 40; // Original assignment
      this.value = 40; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {
    private int value;

    public SerializableSuperClass() {
      this.value = 50; // Original assignment
      this.value = 50; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    private int value;

    public SerializableSubClassWithDuplicate() {
      this.value = 60; // Original assignment
      this.value = 60; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {
    private int value;

    public SerializableSubClassWithoutDuplicate() {
      this.value = 70; // Original assignment
      this.value = 70; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    private int value;

    public SerializableSubSubClassDuplicate() {
      this.value = 80; // Original assignment
      this.value = 80; // Duplicated assignment
    }
  }
}