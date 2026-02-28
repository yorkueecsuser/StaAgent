import java.lang.Integer;
import java.lang.Double;

class BuggyCode {

    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        //...
    }

    public boolean getCondition() {
        return false; // Mutation Operator: the condition of an if statement is a non-final variable
    }

    public void func() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue();

        if (getCondition()) {
            examinePrimitiveInt(boxedInt.intValue());
        } else {
            examinePrimitiveInt(Integer.valueOf(primitiveInt));
        }

        if (getCondition()) {
            examineBoxedInteger(Integer.valueOf(primitiveInt));
        } else {
            examineBoxedInteger(boxedInt.intValue());
        }
    }

    public void showBug() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue();

        examinePrimitiveInt(boxedInt.intValue());
        examinePrimitiveInt(Integer.valueOf(primitiveInt));

        examineBoxedInteger(Integer.valueOf(primitiveInt));
        examineBoxedInteger(boxedInt.intValue());

        return;
    }
}