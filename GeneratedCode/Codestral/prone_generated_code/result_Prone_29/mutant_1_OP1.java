import java.util.function.Supplier;
import java.util.Random;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            String deadStore;  // Dead Store: Inserting unused variable declaration
            Random random = new Random();
            char c = (char)(random.nextInt(26) + 'a');
            deadStore = Character.toString(c);  // Initializing the unused variable
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