import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    private boolean getCondition() {
        return false;
    }

    static class MyModule {
        Supplier<String> provideString() {
            if (getCondition()) {
                // This branch is unreachable
                System.out.println("Unreachable branch");
            }
            return () -> null;
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