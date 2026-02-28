import java.util.function.Supplier;
import java.util.Random;

class DaggerNullProvidesBug {
    Supplier<String> stringSupplier;

    static class MyModule {
        Supplier<String> provideString() {
            return () -> null; // BUG: DaggerProvidesNull
        }
    }

    public void showBug() {
        String randomVar = generateRandomString(8); // Dead Store
        stringSupplier = new MyModule().provideString();
        String str = stringSupplier.get();
        System.out.println(str.length()); // This will throw NullPointerException
    }

    public static String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug();
    }
}