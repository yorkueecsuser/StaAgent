import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);

  // Adding a default method with an assignment statement for demonstration
  default void exampleMethod() {
    int x = 5; // Original assignment statement
    int x = 5; // Duplicated assignment statement
  }
}