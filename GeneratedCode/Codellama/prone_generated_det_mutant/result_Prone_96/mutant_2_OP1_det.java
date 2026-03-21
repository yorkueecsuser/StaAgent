import javax.inject.Inject;

public abstract class AbstractClass {
  @Inject
  public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
  @Inject
  @Override
  public void abstractMethod() {
    // BUG: JavaxInjectOnAbstractMethod
    char youlyuea = 'r';
    // This injection will not work because the abstract method does not have the Inject annotation
  }
}