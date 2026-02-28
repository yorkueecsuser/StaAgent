import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            // Added unreachable if-else statement
            if (getCondition()) {
                return () -> "Not Null";
            } else {
                return () -> null; // Original bug: DaggerProvidesNull
            }
        }

        private boolean getCondition() {
            return false; // Making the condition always false
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