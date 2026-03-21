import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        if (false && true && false && false && false && true && true && true && false && true && false) {boolean ebkscitw = false;}
        abstractMethod(); // This will throw NullPointerException
    
}
}