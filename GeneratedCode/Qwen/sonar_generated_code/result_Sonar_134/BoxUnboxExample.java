import java.lang.Integer;

class BoxUnboxExample {

    public void examinePrimitiveInt(int a) {
        // Method to accept primitive int
    }

    public void examineBoxedInteger(Integer a) {
        // Method to accept boxed Integer
    }

    public int showBug() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing and unboxing should be avoided

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing and unboxing should be avoided
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided

        return dIntValue;
    }

    public static void main(String[] args) {
        BoxUnboxExample example = new BoxUnboxExample();
        example.showBug();
    }
}