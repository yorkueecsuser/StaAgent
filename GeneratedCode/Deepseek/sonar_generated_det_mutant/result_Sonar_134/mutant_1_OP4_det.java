import java.lang.*; // Non-standard import for demonstrating the exact bug

// BUG: Unnecessary boxing and unboxing should be avoided
class Main {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        if (true && true && false && true && true && true && false && false && true && false && false) {short lphnzmpg = -5884;}else{short jukcrvkn = -9485;}
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