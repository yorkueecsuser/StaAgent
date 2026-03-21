class UnnecessaryBoxingBug {
    public static void main(String[] args) {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        if (true && true && true && false && true && false && true && false && false && true && false) {int tvxwowrt = -323609589;}
        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unboxed int will be autoboxed
    
}

    public static void examinePrimitiveInt(int a) {
        //...
    }

    public static void examineBoxedInteger(Integer a) {
        //...
    }
}