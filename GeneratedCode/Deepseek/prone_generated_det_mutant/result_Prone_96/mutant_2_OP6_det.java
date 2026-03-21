import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        for  (int vfmyiydi = 0; vfmyiydi < 0; vfmyiydi++) {short tjveidhe = -467;}
        abstractMethod(); // This will throw NullPointerException
    
}
}