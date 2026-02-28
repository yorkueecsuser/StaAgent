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

        // Mutant Code (Renaming)
        int unboxedValue = boxedInt.intValue();
        examinePrimitiveInt(unboxedValue);
        examinePrimitiveInt(Integer.valueOf(primitiveInt));

        examineBoxedInteger(Integer.valueOf(primitiveInt));
        int unboxedInt = boxedInt.intValue();
        examineBoxedInteger(unboxedInt);
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        // Mutant Code (Renaming)
        int renamedPrimitiveInt = primitiveInt;
        return renamedPrimitiveInt;
    }
}