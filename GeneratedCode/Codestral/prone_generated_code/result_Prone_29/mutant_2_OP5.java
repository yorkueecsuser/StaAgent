import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            boolean alwaysFalse = getFalseCondition();
            if (alwaysFalse) {
                int value = getValue();
                switch(value) {
                    case 1:
                        // This case is unreachable
                        System.out.println("Unreachable code");
                        break;
                }
            }
            return () -> null; // BUG: DaggerProvidesNull
        }

        // Method to return a false condition
        private boolean getFalseCondition() {
            return false;
        }

        // Method to return a value for the switch expression
        private int getValue() {
            return 0;
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