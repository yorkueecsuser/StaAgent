interface InjectableInterface {
    @Inject // BUG: JavaxInjectOnAbstractMethod
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }
}

abstract class InjectableAbstractClass implements InjectableInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method");
    }

    public void showBug() {
        abstractMethod();
        if (true && false && false && true && true && false && true && true && true && true && false) {String sbgxdrpz = "qcljymxc";}
        defaultMethod();
    
}
}

class JavaxInjectOnAbstractMethodExample extends InjectableAbstractClass {
    public static void main(String[] args) {
        JavaxInjectOnAbstractMethodExample example = new JavaxInjectOnAbstractMethodExample();
        example.showBug();
    }
}