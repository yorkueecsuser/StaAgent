class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public boolean getCondition() {
        return false;
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

        // Mutated code: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line should never be executed");
        } else {
            System.out.println("This is the else branch that is also unreachable");
        }
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        return primitiveInt;
    }
}