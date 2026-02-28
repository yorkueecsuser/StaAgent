import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            return () -> null; // BUG: DaggerProvidesNull
        }
    }

    public void showBug() {
        stringSupplier = new MyModule().provideString();

        // Mutant code: Duplicate the assignment and add a default value if it's null
        stringSupplier = (stringSupplier!= null)? stringSupplier : () -> "Default Value";

        String str = stringSupplier.get();
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug();
    }
}