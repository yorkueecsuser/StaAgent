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
        int pInt = 0;
        Integer bInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue();

        examinePrimitiveInt(bInt); // Renamed 'boxedInt' to 'bInt'
        examinePrimitiveInt(Integer.valueOf(pInt));  

        examineBoxedInteger(Integer.valueOf(pInt)); 
        examineBoxedInteger(bInt.intValue()); 
    }

    public void showBug() {
        int pInt = 0;
        Integer bInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue();

        examinePrimitiveInt(bInt);
        examinePrimitiveInt(Integer.valueOf(pInt)); 

        examineBoxedInteger(Integer.valueOf(pInt));
        examineBoxedInteger(bInt.intValue());

        return;
    }
}