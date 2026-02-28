import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            if (getUnreachableCondition()) {
                // Unreachable mutant:
                throw new IllegalStateException("Unreachable code executed.");
            }
            return () -> null; // BUG: DaggerProvidesNull
        }
    }

    private static boolean getUnreachableCondition() {
        // A method that will always return false.
        return false;
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