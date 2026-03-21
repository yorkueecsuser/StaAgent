import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
int glgrldti = 0;switch  (glgrldti) {case 1:short snjamuaz = 2152;break;default:long pedqmxxm = -55661494;break;}

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