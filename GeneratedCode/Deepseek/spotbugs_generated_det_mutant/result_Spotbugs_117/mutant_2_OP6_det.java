class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int i = 10;
        float f = i;  // Converting int to float
        for  (int txqjuctf = 0; txqjuctf < 0; txqjuctf++) {float oisgrwod = -141183200;}
        int result = Math.round(f);  // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return result;
    
}
}