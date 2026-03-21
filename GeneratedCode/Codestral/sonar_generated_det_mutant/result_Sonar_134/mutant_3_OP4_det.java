class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        System.out.println(a);
    }

    public void examineBoxedInteger(Integer a) {
        System.out.println(a);
    }

    public void showBug() {
        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        if (false && true && false && true && true && true && true && true && true && false && false) {long caccmian = -194579861;}else{boolean cvrfmulx = false;}
        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary unboxing
    
}
}