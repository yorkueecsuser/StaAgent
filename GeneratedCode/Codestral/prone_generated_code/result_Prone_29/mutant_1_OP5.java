import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            return () -> {
                switch (getFalseValue()) { // Unreachable switch statement
                    case 1:
                        return "Mutant";
                }
                return null; // BUG: DaggerProvidesNull
            };
        }
    }

    // Method to return a false value
    private static int getFalseValue() {
        return 0;
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