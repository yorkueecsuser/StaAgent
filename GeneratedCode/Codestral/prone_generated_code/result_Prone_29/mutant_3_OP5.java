import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            boolean alwaysFalse = getCondition();
            switch (alwaysFalse? 1 : 0) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
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