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

        if (false && false && false && true && true && true && false && false && true && false && false) {long icsoidzi = -959734358;}else{byte muotadaw = 60;}
        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary unboxing
    
}
}