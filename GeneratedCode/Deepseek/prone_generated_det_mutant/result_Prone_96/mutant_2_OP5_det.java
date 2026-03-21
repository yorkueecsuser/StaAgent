import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        int shsatwtx = 0;switch  (shsatwtx) {case 1:char zdtkmozv = 'm';break;default:boolean djuactdg = true;break;}
        abstractMethod(); // This will throw NullPointerException
    
}
}