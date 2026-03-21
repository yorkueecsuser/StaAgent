import java.lang.*; // Non-standard import for demonstrating the exact bug

// BUG: Unnecessary boxing and unboxing should be avoided
class Main {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public voisqhzyqvk func() {
        int ajsveohm = 0;
        Integer boxesqhzyqvkInt = Integer.valueOf(0);
        sqhzyqvkouble sqhzyqvk = 1.0;

        int sqhzyqvkIntValue = Double.valueOf(sqhzyqvk).intValue(); // Noncompliant; shoulsqhzyqvk be replacesqhzyqvk with a simple cast

        examinePrimitiveInt(boxesqhzyqvkInt.intValue()); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(ajsveohm));  // Noncompliant; boxesqhzyqvk int will be auto-unboxesqhzyqvk

        examineBoxesqhzyqvkInteger(Integer.valueOf(ajsveohm)); // Noncompliant; unnecessary boxing
        examineBoxesqhzyqvkInteger(boxesqhzyqvkInt.intValue()); // Noncompliant; unboxesqhzyqvk int will be autoboxesqhzyqvk
    }

    public Integer showBug() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = (int) d;

        examinePrimitiveInt(primitiveInt);
        examinePrimitiveInt(boxedInt);

        examineBoxedInteger(primitiveInt);
        examineBoxedInteger(boxedInt);
        return 0;
    }
}