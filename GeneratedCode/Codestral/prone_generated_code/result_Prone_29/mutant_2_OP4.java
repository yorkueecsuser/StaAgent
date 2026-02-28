import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            if (shouldRunUnreachableCode()) { // Mutant code added
                // Unreachable code
                System.out.println("This code is unreachable");
            }
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

    // Method to dynamically determine if unreachable code should run
    private static boolean shouldRunUnreachableCode() {
        return false;
    }
}