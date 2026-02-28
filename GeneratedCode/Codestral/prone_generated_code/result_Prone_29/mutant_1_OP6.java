import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            boolean shouldNotRun = false;
            for (int i = 0; shouldNotRun; i++) {
                // This is an unreachable for loop as the condition is always false
                System.out.println("This line should never execute");
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