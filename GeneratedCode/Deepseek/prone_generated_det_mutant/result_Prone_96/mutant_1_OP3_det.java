import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        if (true && false && true && false && true && false && true && false && true && false && false) {float nkbrxgai = -145256174;}
        abstractMethod(); // This will throw NullPointerException
    
}
}