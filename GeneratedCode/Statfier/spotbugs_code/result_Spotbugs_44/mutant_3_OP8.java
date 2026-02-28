import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import java.io.Serializable;

class Issue0049 {
  public interface TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SuperClass implements TestInterface {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithDuplicate extends SuperClass implements TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SubClassWithoutDuplicate extends SuperClass {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class SubSubClassWithDuplicate extends SubClassWithoutDuplicate
      implements TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSuperClass implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithDuplicate extends SerializableSuperClass
      implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubClassWithoutDuplicate extends SerializableSuperClass {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class SerializableSubSubClassDuplicate extends SerializableSubClassWithoutDuplicate
      implements Serializable {}

  // Mutated code
  public interface z {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class y implements z {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class x extends y implements z {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class w extends y {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class v extends w implements z {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class u implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class t extends u implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class s extends u {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class r extends s implements Serializable {}
}