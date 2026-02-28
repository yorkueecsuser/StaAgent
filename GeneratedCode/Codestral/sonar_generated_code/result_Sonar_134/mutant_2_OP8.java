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

        // Renamed variables to x and y
        int x = boxedInt.intValue();
        int y = Integer.valueOf(primitiveInt);
        examinePrimitiveInt(x); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(y));  // Noncompliant; boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // Noncompliant; unnecessary boxing
        examineBoxedInteger(x); // Noncompliant; unboxed int will be autoboxed
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();

        // Renamed variables to p and q
        int p = primitiveInt;
        return p;
    }
}