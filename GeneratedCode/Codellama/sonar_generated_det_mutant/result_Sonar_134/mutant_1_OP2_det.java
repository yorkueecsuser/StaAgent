class UnnecessaryBoxingBug {
public static void main(String [] args){
    int primitiveInt = 0;
    primitiveInt = 0;
    Integer boxedInt = Integer.valueOf(0);
    double d = 1.0;
    int dIntValue = Double.valueOf(d ).intValue();
    examinePrimitiveInt(boxedInt.intValue());
    examinePrimitiveInt(Integer.valueOf(primitiveInt));
    examineBoxedInteger(Integer.valueOf(primitiveInt));
    examineBoxedInteger(boxedInt.intValue());
}

    public static void examinePrimitiveInt(int a) {
        //...
    }

    public static void examineBoxedInteger(Integer a) {
        //...
    }
}