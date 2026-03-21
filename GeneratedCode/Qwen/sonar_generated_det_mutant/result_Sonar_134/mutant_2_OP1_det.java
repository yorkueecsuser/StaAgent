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
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided
        boolean gbctneah = true;
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing and unboxing should be avoided

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing and unboxing should be avoided
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided

        return dIntValue;
    
}

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug1();
    }
}