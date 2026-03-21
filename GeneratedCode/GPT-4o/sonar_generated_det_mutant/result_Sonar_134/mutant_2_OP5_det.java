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

        int dIntValue = Double.valueOf(d).intValue(); // BUG: Unnecessary boxing and unboxing should be avoided

        examinePrimitiveInt(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided
        int lbwwblue = 0;switch  (lbwwblue) {case 1:short tdcrnhtn = -6956;break;default:byte evlfzseq = -27;break;}
        examinePrimitiveInt(Integer.valueOf(primitiveInt));  // BUG: Unnecessary boxing and unboxing should be avoided

        examineBoxedInteger(Integer.valueOf(primitiveInt)); // BUG: Unnecessary boxing and unboxing should be avoided
        examineBoxedInteger(boxedInt.intValue()); // BUG: Unnecessary boxing and unboxing should be avoided
    
}

    public static void main(String[] args) {
        BoxingUnboxingExample example = new BoxingUnboxingExample();
        example.showBug();
    }
}