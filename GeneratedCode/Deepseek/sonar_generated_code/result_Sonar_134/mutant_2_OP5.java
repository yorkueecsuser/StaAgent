import java.lang.Integer;
import java.lang.Double;

class BuggyCode {

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

        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt);  // MUTANT: Removed unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // MUTANT: Removed boxing

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // MUTANT: Removed boxing
        examineBoxedInteger(boxedInt.intValue()); // MUTANT: Removed unboxing
    }

    public void showBug() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue();

        examinePrimitiveInt(boxedInt);
        examinePrimitiveInt(Integer.valueOf(primitiveInt));

        examineBoxedInteger(Integer.valueOf(primitiveInt));
        examineBoxedInteger(boxedInt.intValue());

        return;
    }
}