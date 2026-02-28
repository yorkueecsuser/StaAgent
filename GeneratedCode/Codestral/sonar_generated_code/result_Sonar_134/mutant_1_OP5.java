class UnnecessaryBoxingUnboxing {
    //...

    public void func() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue(); // Noncompliant; should be replaced with a simple cast

        examinePrimitiveInt(boxedInt.intValue()); // Noncompliant; unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // Noncompliant; boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // Noncompliant; unnecessary boxing

        boolean condition = getCondition();
        if(condition) {
            switch(1) {  // Unreachable switch statement mutant
                case 0:
                    System.out.println("This code is unreachable");
                    break;
            }
        }

        examineBoxedInteger(boxedInt.intValue()); // Noncompliant; unboxed int will be autoboxed
    }

    //...

    private boolean getCondition() {
        return false;   // Always returns false to ensure the switch statement is unreachable
    }
}