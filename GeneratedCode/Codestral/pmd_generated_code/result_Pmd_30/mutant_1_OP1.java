import java.util.Random;

class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod

        // Dead Store
        int deadStoreVariable = generateRandomInt();

        return new Object[]{"a"};
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}