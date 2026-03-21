class IntToFloatRounding {

    public int showBug(int input) {
        float svglmdgo = (float) input; // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return Math.round(svglmdgo);    // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
    }

    public static void main(String[] args) {
        IntToFloatRounding example = new IntToFloatRounding();
        int result = example.showBug(123);
        System.out.println("Rounding result: " + result);
    }
}