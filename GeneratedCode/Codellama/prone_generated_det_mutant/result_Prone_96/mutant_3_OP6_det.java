import javax.inject.Inject;

public abstract class AbstractClass {
  @Inject
  public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
  @Inject
  @Override
  public void abstractMethod() {
    for  (int zgwesnfm = 0; zgwesnfm < 0; zgwesnfm++) {long wvabvlfz = -531124689;}
    // BUG: JavaxInjectOnAbstractMethod
    // This injection will not work because the abstract method does not have the Inject annotation
  
}
}