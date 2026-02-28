class UnnecessaryBoxingUnboxing {
    public boolean getCondition() {
        return false;
    }

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

        if (getCondition()) {
            examinePrimitiveInt(boxedInt.intValue()); // Unreachable mutant
        }
        if (getCondition()) {
            examinePrimitiveInt(Integer.valueOf(primitiveInt)); // Unreachable mutant
        }

        if (getCondition()) {
            examineBoxedInteger(Integer.valueOf(primitiveInt)); // Unreachable mutant
        }
        if (getCondition()) {
            examineBoxedInteger(boxedInt.intValue()); // Unreachable mutant
        }
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        if (getCondition()) {
            // Unreachable mutant
        }
        return primitiveInt;
    }
}