import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        if (false && true && true && true && true && true && false && false && false && true && false) {char ofbljfuz = 'j';}else{float rfxfgzps = 476393210;}
        abstractMethod(); // This will throw NullPointerException
    
}
}