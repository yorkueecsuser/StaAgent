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
  public interface q {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class a extends SuperClass implements TestInterface {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class b extends a implements TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class c extends a {}

  @ExpectWarning("RI_REDUNDANT_INTERFACES")
  public static class d extends c implements TestInterface {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class e implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class f extends e implements Serializable {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class g extends e {}

  @NoWarning("RI_REDUNDANT_INTERFACES")
  public static class h extends g implements Serializable {}
}