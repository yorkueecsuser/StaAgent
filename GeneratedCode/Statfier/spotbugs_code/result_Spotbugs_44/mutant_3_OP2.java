import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {
    public void dummyMethod() {
      int x = 10; // Original assignment
      int x1 = 10; // Duplicated assignment
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {
    public void dummyMethod() {
      String str = "test"; // Original assignment
      String str1 = "test"; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {
    public void dummyMethod() {
      boolean flag = true; // Original assignment
      boolean flag1 = true; // Duplicated assignment
    }
  }

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {
    public void dummyMethod() {
      double d = 3.14; // Original assignment
      double d1 = 3.14; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {
    public void dummyMethod() {
      char c = 'a'; // Original assignment
      char c1 = 'a'; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {
    public void dummyMethod() {
      long l = 100L; // Original assignment
      long l1 = 100L; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {
    public void dummyMethod() {
      float f = 2.718f; // Original assignment
      float f1 = 2.718f; // Duplicated assignment
    }
  }

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {
    public void dummyMethod() {
      byte b = 10; // Original assignment
      byte b1 = 10; // Duplicated assignment
    }
  }
}