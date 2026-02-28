import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            boolean shouldLoop = getCondition();
            for (int i = 0; shouldLoop; i++) { // Unreachable for loop
                System.out.println("This loop will never execute");
            }
            return () -> null; // BUG: DaggerProvidesNull
        }

        private boolean getCondition() {
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