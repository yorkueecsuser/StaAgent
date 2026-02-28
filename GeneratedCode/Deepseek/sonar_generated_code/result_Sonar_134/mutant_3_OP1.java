import java.lang.Integer;
import java.lang.Double;

class BuggyCode {

    String a = "abcdefgh"; // This line is added as a 'dead store'

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

        examinePrimitiveInt(boxedInt.intValue()); 
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  

        examineBoxedInteger(Integer.valueOf(primitiveInt)); 
        examineBoxedInteger(boxedInt.intValue()); 
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