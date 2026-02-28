import javax.annotation.Nullable;

public interface InconsistentSubclassAnnotationInterface {

  public String implementInAnotherFile(@Nullable String s);

  Object overloadedMethod();

  Object overloadedMethod(Object object);
}

class ExampleImplementation implements InconsistentSubclassAnnotationInterface {

  @Override
  public String implementInAnotherFile(@Nullable String s) {
    String original = "originalValue"; // Original variable
    String x = "mutatedValue"; // Mutated variable
    return s!= null? s : original;
  }

  @Override
  public Object overloadedMethod() {
    return new Object();
  }

  @Override
  public Object overloadedMethod(Object object) {
    return object;
  }
}