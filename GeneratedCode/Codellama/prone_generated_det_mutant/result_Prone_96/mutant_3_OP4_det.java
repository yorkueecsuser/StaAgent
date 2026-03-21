import javax.inject.Inject;

public abstract class AbstractClass {
  @Inject
  public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
  @Inject
  @Override
  public void abstractMethod() {
    if (true && true && true && false && true && true && false && true && true && true && false) {float skjsetgn = 348160527;}else{long qfqeywva = -391708356;}
    // BUG: JavaxInjectOnAbstractMethod
    // This injection will not work because the abstract method does not have the Inject annotation
  
}
}