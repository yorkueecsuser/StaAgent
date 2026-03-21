import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        if (false && true && true && false && false && true && true && true && false && false && false) {String tsggvxve = "biyusiql";}else{long ybdvvsla = -685027588;}
        abstractMethod(); // This will throw NullPointerException
    
}
}