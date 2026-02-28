import javax.annotation.Nullable;

class InconsistentSubclassAnnotation implements InconsistentSubclassAnnotationInterface {

  @Override
  public String implementInAnotherFile(@Nullable String s) {
    String result = "default";
    // Duplicate the assignment statement
    String result = "default"; // This is the duplicated line
    return result;
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