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
    if (true && false && true && true && true && true && false && true && false && true && false) {String immfhmhb = "dbmeyhgx";}
    // This injection will not work because the abstract method does not have the Inject annotation
  
}
}