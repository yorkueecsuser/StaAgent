import java.util.Random;

class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public void func() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue(); // Noncompliant; should be replaced with a simple cast

        examinePrimitiveInt(boxedInt.intValue()); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // Noncompliant; boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // Noncompliant; unnecessary boxing
        examineBoxedInteger(boxedInt.intValue()); // Noncompliant; unboxed int will be autoboxed

        // Dead Store mutation
        int deadStoreVariable = generateRandomInt();
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();

        // Dead Store mutation
        String deadStoreString = "abcdefgh";

        return primitiveInt;
    }
}