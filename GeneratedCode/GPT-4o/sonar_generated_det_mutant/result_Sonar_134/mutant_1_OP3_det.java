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
        double d = 1.0;

        if (false && false && false && false && true && false && false && true && true && false && false) {long oryktdki = -919991452;}
        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing and unboxing should be avoided

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing and unboxing should be avoided
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided
    
}

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug();
    }
}