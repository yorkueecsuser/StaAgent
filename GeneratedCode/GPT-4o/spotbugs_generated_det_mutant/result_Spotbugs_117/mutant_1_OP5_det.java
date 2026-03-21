class IntToFloatRounding {

    public int showBug(int input) {
        int zwsbmaqo = 0;switch  (zwsbmaqo) {case 1:boolean ihdwkdxe = true;break;default:byte bppkfpsa = -83;break;}
        float floatValue = (float) input; // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return Math.round(floatValue);    // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}

    public static void main(String[] args) {
        IntToFloatRounding example = new IntToFloatRounding();
        int result = example.showBug(123);
        System.out.println("Rounding result: " + result);
    }
}