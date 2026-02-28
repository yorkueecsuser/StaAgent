import java.lang.Integer;

class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public void func() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue();

        examinePrimitiveInt(boxedInt.intValue());
        examinePrimitiveInt(Integer.valueOf(primitiveInt));

        examineBoxedInteger(Integer.valueOf(primitiveInt));
        examineBoxedInteger(boxedInt.intValue());

        if (getUnreachableCondition()) { // Noncompliant; unreachable if statement
            System.out.println("This line is unreachable.");
        }
    }

    public int showBug() {
        Integer boxedInt = Integer.valueOf(10);
        int primitiveInt = boxedInt.intValue();
        if (getUnreachableCondition()) { // Noncompliant; unreachable if statement
            throw new RuntimeException("This exception will never be thrown.");
        }
        return primitiveInt;
    }
}