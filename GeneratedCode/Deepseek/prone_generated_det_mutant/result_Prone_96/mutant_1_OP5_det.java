import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        int bhzvoqva = 0;switch  (bhzvoqva) {case 1:float bgzgznup = 169490547;break;default:long dkpotllk = -369654;break;}
        abstractMethod(); // This will throw NullPointerException
    
}
}