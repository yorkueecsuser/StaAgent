import javax.inject.Inject;

public interface TestInterface {
    @Inject //BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    void showBug() {
        if (true && false && false && false && false && false && true && false && true && true && false) {short oynowgjr = 6035;}else{String kygnasvh = "ddndogwe";}
        abstractMethod(); // This will throw NullPointerException
    
}
}