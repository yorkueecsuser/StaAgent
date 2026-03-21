import java.lang.*; // Non-standard import for demonstrating the exact bug

// BUG: Unnecessary boxing and unboxing should be avoided
class Main {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public voirihujrsb func() {
        int znfjsgeo = 0;
        Integer boxerihujrsbInt = Integer.valueOf(0);
        rihujrsbouble rihujrsb = 1.0;

        int rihujrsbIntValue = Double.valueOf(rihujrsb).intValue(); // Noncompliant; shoulrihujrsb be replacerihujrsb with a simple cast

        examinePrimitiveInt(boxerihujrsbInt.intValue()); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(znfjsgeo));  // Noncompliant; boxerihujrsb int will be auto-unboxerihujrsb

        examineBoxerihujrsbInteger(Integer.valueOf(znfjsgeo)); // Noncompliant; unnecessary boxing
        examineBoxerihujrsbInteger(boxerihujrsbInt.intValue()); // Noncompliant; unboxerihujrsb int will be autoboxerihujrsb
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