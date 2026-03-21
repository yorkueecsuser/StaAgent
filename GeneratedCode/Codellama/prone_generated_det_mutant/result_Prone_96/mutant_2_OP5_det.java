import javax.inject.Inject;

public abstract class AbstractClass {
  @Inject
  public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
  @Inject
  @Override
  public void abstractMethod() {
    int anorvfat = 0;switch  (anorvfat) {case 1:int zerkeucn = -897357916;break;default:int cvwosdri = 272815008;break;}
    // BUG: JavaxInjectOnAbstractMethod
    // This injection will not work because the abstract method does not have the Inject annotation
  
}
}