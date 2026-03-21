import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        int wckniyjc = 0;switch  (wckniyjc) {case 1:float qojsouya = -493298212;break;default:double smanqdlr = -94718306;break;}
        abstractMethod(); // This will throw NullPointerException
    
}
}