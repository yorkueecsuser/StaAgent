import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        if (false && false && true && false && true && false && false && false && false && true && false) {int svggomhy = 782151466;}
        abstractMethod(); // This will throw NullPointerException
    
}
}