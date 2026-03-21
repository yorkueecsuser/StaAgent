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
    for  (int wytdvtiz = 0; wytdvtiz < 0; wytdvtiz++) {short agzspfsk = -3677;}
    // This injection will not work because the abstract method does not have the Inject annotation
  
}
}