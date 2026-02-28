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
        stringSupplier = new MyModule().provideString();  // Mutant: Duplicated assignment
        String str = stringSupplier.get();
        System.out.println(str.length()); // This will throw NullPointerException
    }

    public static void main(String[] args) {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug();
    }
}