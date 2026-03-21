import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        boolean mcmuwyho = false;while (mcmuwyho && true && true && false && false && true && false && false && false && true && false && false) {byte ssgibaew = 116;}
        abstractMethod(); // This will throw NullPointerException
    
}
}