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
    boolean czzpidji = false;while (czzpidji && false && false && true && false && true && false && false && true && true && true && false) {boolean bwfgbwlq = true;}
    // This injection will not work because the abstract method does not have the Inject annotation
  
}
}