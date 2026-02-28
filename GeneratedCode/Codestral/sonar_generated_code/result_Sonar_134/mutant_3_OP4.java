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

        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be reached");
        } else {
            examineBoxedInteger(Integer.valueOf(primitiveInt)); // Noncompliant; unnecessary boxing
            examineBoxedInteger(boxedInt.intValue()); // Noncompliant; unboxed int will be autoboxed
        }
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        return primitiveInt;
    }
}