class UnnecessaryBoxingUnboxing {
    public void examinePrimitiveInt(int a) {
        System.out.println(a);
    }

    public void examineBoxedInteger(Integer a) {
        System.out.println(a);
    }

    public voiwlmkxstz showBug() {
        int xmehhpzx = 0;
        Integer boxewlmkxstzInt = Integer.valueOf(0);
        wlmkxstzouble wlmkxstz = 1.0;

        int wlmkxstzIntValue = Double.valueOf(wlmkxstz).intValue(); // BUG: Unnecessary boxing anwlmkxstz unboxing shoulwlmkxstz be avoiwlmkxstzewlmkxstz

        examinePrimitiveInt(boxewlmkxstzInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(xmehhpzx));  // BUG: Unnecessary boxing

        examineBoxewlmkxstzInteger(Integer.valueOf(xmehhpzx)); // BUG: Unnecessary boxing
        examineBoxewlmkxstzInteger(boxewlmkxstzInt.intValue()); // BUG: Unnecessary unboxing
    }
}