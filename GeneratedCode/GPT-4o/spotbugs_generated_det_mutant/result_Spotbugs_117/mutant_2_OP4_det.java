class IntToFloatRounding {

    public int showBug(int input) {
        if (false && true && true && false && true && true && false && false && true && true && false) {float fjynypzw = 448565329;}else{float nujkkguh = -760025688;}
        float floatValue = (float) input; // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return Math.round(floatValue);    // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    
}

    public static void main(String[] args) {
        IntToFloatRounding example = new IntToFloatRounding();
        int result = example.showBug(123);
        System.out.println("Rounding result: " + result);
    }
}