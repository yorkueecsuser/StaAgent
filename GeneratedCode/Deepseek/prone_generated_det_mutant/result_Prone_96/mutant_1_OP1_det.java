import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        double ytzutfmd = -832243647;
        abstractMethod(); // This will throw NullPointerException
    
}
}