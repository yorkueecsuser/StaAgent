import javax.inject.Inject;

public abstract class AbstractClass {
  @Inject
  public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
  @Inject
  @Override
  public void abstractMethod() {
    if (false && false && true && true && true && false && true && true && false && false && false) {int mtrpwzhg = -109051835;}
    // BUG: JavaxInjectOnAbstractMethod
    // This injection will not work because the abstract method does not have the Inject annotation
  }
}