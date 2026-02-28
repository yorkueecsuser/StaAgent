import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> a;

    static class MyModule {
        Supplier<String> provideString() {
            return () -> null; // BUG: DaggerProvidesNull
        }
    }

    public void showBug() {
        a = new MyModule().provideString();
        String str = a.get();
        System.out.println(str.length()); // This will throw NullPointerException
    }

    public static void main(String[] args) {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug();
    }
}