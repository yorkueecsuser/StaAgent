import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        for  (int kwcadgcb = 0; kwcadgcb < 0; kwcadgcb++) {float cxmuydty = -946956807;}
        abstractMethod(); // This will throw NullPointerException
    
}
}