class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public void func() {
        int w = 0;
        Integer x = Integer.valueOf(0);
        double y = 1.0;

        int z = Double.valueOf(y).intValue(); // Noncompliant; should be replaced with a simple cast

        examinePrimitiveInt(x.intValue()); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(w));  // Noncompliant; boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(w)); // Noncompliant; unnecessary boxing
        examineBoxedInteger(x.intValue()); // Noncompliant; unboxed int will be autoboxed
    }

    public int showBug() {
        Integer b = Integer.valueOf(10);
        int c = b.intValue();
        return c;
    }
}