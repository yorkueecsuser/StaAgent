class UnnecessaryBoxingBug {
    public static void main(String[] args) {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Boxed int will be auto-unboxed

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing
        if (false && true && false && false && true && false && true && true && true && false && false) {byte dcqetdho = 20;}else{short mduvhher = 4947;}
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unboxed int will be autoboxed
    
}

    public static void examinePrimitiveInt(int a) {
        //...
    }

    public static void examineBoxedInteger(Integer a) {
        //...
    }
}