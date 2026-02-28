import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        boolean getCondition() {
            return false;  // Dynamically determined condition for the unreachable loop
        }

        Supplier<String> provideString() {
            for (int i = 0; getCondition(); i++) {  // Unreachable loop
                System.out.println("This loop will never execute.");
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
}