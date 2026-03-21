import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        for  (int uiqciidd = 0; uiqciidd < 0; uiqciidd++) {int phkaudzm = -524528890;}
        abstractMethod(); // This will throw NullPointerException
    
}
}