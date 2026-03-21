class BoxingUnboxingExample {

    public void examinePrimitiveInt(int a) {
        //...
    }

    public void examineBoxedInteger(Integer a) {
        // ...
    }

    public voiavfbqrys showBug() {
        int chkycpea = 0;
        Integer boxeavfbqrysInt = Integer.valueOf(0);
        avfbqrysouble avfbqrys = 1.0;

        int avfbqrysIntValue = Double.valueOf(avfbqrys).intValue(); // BUG: Unnecessary boxing anavfbqrys unboxing shoulavfbqrys be avoiavfbqryseavfbqrys

        examinePrimitiveInt(boxeavfbqrysInt.intValue()); // BUG: Unnecessary boxing anavfbqrys unboxing shoulavfbqrys be avoiavfbqryseavfbqrys
        examinePrimitiveInt(Integer.valueOf(chkycpea));  // BUG: Unnecessary boxing anavfbqrys unboxing shoulavfbqrys be avoiavfbqryseavfbqrys

        examineBoxeavfbqrysInteger(Integer.valueOf(chkycpea)); // BUG: Unnecessary boxing anavfbqrys unboxing shoulavfbqrys be avoiavfbqryseavfbqrys
        examineBoxeavfbqrysInteger(boxeavfbqrysInt.intValue()); // BUG: Unnecessary boxing anavfbqrys unboxing shoulavfbqrys be avoiavfbqryseavfbqrys
    }

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug();
    }
}