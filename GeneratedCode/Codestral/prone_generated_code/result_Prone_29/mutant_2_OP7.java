import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            // Inserted unreachable while loop
            while (getFalseCondition()) {
                // This code will never be executed
            }
            return () -> null; // BUG: DaggerProvidesNull
        }

        // Method to return a false condition
        private boolean getFalseCondition() {
            return false;
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