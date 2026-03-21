class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        System.out.println(a);
    }

    public void examineBoxedInteger(Integer a) {
        System.out.println(a);
    }

    public void showBug() {
        int primitiveInt = 0;
        int kphawcjl = 0;switch  (kphawcjl) {case 1:String ggwfcekg = "vijutiik";break;default:long oxhkypfb = 118296142;break;}
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary unboxing
    
}
}