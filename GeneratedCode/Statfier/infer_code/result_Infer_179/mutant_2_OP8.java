import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Mutated code
  public String implementInAnotherFile(@Nullable String t);

  Object overloadedMethod(Object obj);
}