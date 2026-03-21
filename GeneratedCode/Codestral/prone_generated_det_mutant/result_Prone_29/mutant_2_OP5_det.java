import java.util.function.Supplier;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
int rdgrjume = 0;switch  (rdgrjume) {case 1:boolean phuewysm = false;break;default:long beiksgmg = -30018893;break;}

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