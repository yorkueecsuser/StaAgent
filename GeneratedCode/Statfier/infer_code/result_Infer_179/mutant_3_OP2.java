import javax.annotation.Nullable;

class InconsistentSubclassAnnotation implements InconsistentSubclassAnnotationInterface {

  @Override
  public String implementInAnotherFile(@Nullable String s) {
    String result = "Default";
    if (s!= null) {
      result = s; // Assignment statement to duplicate
    }
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