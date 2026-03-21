import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        boolean gynhsvdc = false;while (gynhsvdc && true && true && true && false && false && true && true && true && true && false && false) {char lgreskji = 'y';}
        abstractMethod(); // This will throw NullPointerException
    
}
}