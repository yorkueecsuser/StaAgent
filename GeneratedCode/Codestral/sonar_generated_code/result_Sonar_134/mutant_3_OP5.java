class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public boolean getFalseCondition() {
        // This method always returns false
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

        // Added unreachable switch statement within an if block that always evaluates to false
        if (getFalseCondition()) {
            int value = 1; // Replace this value with a random non-existing case value
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                // Add more cases if needed to make the switch statement unreachable
            }
        }
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        return primitiveInt;
    }
}