import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
boolean xxjzfdil = false;while (xxjzfdil && false && false && true && true && true && false && true && false && true && false && false) {String cvamumfu = "xaoebpml";}

            return () -> null; // BUG: DaggerProvidesNull
        
}
    }

    public void showBug() {
        stringSupplier = new MyModule().provideString();
        String str = stringSupplier.get();
        System.out.println(str.length()); // This will throw NullPointerException
    }

    public static void main(String[] args) {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug();
    }
}