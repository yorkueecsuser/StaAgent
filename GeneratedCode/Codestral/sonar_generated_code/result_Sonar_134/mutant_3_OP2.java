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

        int dIntValue = Double.valueOf(d).intValue();
        // Mutated code: Duplicating the assignment statement
        int dIntValueDuplicate = Double.valueOf(d).intValue();  // New assignment statement

        examinePrimitiveInt(boxedInt.intValue());
        // Mutated code: Duplicating the assignment statement
        examinePrimitiveInt(boxedInt.intValue());  // Duplicate unboxing

        examinePrimitiveInt(Integer.valueOf(primitiveInt));
        // Mutated code: Duplicating the assignment statement
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // Duplicate boxing

        examineBoxedInteger(Integer.valueOf(primitiveInt));
        // Mutated code: Duplicating the assignment statement
        examineBoxedInteger(Integer.valueOf(primitiveInt));  // Duplicate boxing

        examineBoxedInteger(boxedInt.intValue());
        // Mutated code: Duplicating the assignment statement
        examineBoxedInteger(boxedInt.intValue());  // Duplicate unboxing
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        // Mutated code: Duplicating the assignment statement
        int primitiveIntDuplicate = boxedInt.intValue();  // New assignment statement
        return primitiveInt;
    }
}