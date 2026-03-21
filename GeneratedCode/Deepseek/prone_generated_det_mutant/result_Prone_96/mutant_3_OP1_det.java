import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        double kwlqwjmc = 891339222;
        abstractMethod(); // This will throw NullPointerException
    
}
}