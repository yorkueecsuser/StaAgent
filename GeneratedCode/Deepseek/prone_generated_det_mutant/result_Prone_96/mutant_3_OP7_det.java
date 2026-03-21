import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        boolean lxqryhhf = false;while (lxqryhhf && false && false && false && true && true && false && true && true && false && false && false) {byte paefqzit = 29;}
        abstractMethod(); // This will throw NullPointerException
    
}
}