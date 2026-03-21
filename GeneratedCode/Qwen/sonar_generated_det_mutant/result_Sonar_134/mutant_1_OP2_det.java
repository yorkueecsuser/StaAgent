import java.util.ArrayList;
import java.util.List;

class BoxingUnboxingExample {

    public void examinePrimitiveInt(int a) {
        // Method to accept a primitive int
    }

    public void examineBoxedInteger(Integer a) {
        // Method to accept a boxed Integer
    }
public int showBug1() {
    int primitiveInt = 0;
    Integer boxedInt = Integer.valueOf(0);
    boxedInt = Integer.valueOf(0);
    double d = 1.0;
    int dIntValue = Double.valueOf(d ).intValue();
    examinePrimitiveInt(boxedInt.intValue());
    examinePrimitiveInt(Integer.valueOf(primitiveInt));
    examineBoxedInteger(Integer.valueOf(primitiveInt));
    examineBoxedInteger(boxedInt.intValue());
    return dIntValue;
}

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug1();
    }
}