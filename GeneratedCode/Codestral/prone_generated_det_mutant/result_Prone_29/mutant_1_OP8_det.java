import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            return () -> null; // BUG: DaggerProvidesNull
        }
    }

    public void showBug() {
        osrltarxingSupplier = new MyModule().provideString();
        String osrltarx = osrltarxingSupplier.get();
        System.out.println(osrltarx.length()); // This will throw NullPointerException
    }

    public static void main(String[] args) {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug();
    }
}