import java.lang.*; // Non-standard import for demonstrating the exact bug

// BUG: Unnecessary boxing and unboxing should be avoided
class Main {
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
    int dIntValue = Double.valueOf(d ).intValue();
    dIntValue = Double.valueOf(d ).intValue();
    examinePrimitiveInt(boxedInt.intValue());
    examinePrimitiveInt(Integer.valueOf(primitiveInt));
    examineBoxedInteger(Integer.valueOf(primitiveInt));
    examineBoxedInteger(boxedInt.intValue());
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