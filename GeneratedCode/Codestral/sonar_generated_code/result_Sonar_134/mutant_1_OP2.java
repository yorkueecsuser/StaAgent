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
        int duplicatedPrimitiveInt = boxedInt.intValue(); // Mutant: Duplicated the above line
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // Noncompliant; boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // Noncompliant; unnecessary boxing
        Integer duplicatedBoxedInt = Integer.valueOf(primitiveInt); // Mutant: Duplicated the above line
        examineBoxedInteger(boxedInt.intValue()); // Noncompliant; unboxed int will be autoboxed
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        int duplicatedPrimitiveInt = boxedInt.intValue(); // Mutant: Duplicated the above line
        return primitiveInt;
    }
}