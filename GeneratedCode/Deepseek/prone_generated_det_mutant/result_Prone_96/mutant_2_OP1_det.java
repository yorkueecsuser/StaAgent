import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        int ufwaliqp = 442305497;
        abstractMethod(); // This will throw NullPointerException
    
}
}