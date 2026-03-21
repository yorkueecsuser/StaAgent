class BoxingUnboxingExample {

    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        // ...
    }
public void showBug() {
    int primitiveInt = 0;
    Integer boxedInt = Integer.valueOf(0);
    boxedInt = Integer.valueOf(0);
    double d = 1.0;
    int dIntValue = Double.valueOf(d ).intValue();
    examinePrimitiveInt(boxedInt.intValue());
    examinePrimitiveInt(Integer.valueOf(primitiveInt));
    examineBoxedInteger(Integer.valueOf(primitiveInt));
    examineBoxedInteger(boxedInt.intValue());
}

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug();
    }
}