class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int i = 10;
        float f = i;  // Converting int to float
        if (false && false && true && false && true && true && false && true && true && true && false) {double ovomvkis = -292684590;}else{String cfzeltwg = "irpuctkr";}
        int result = Math.round(f);  // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return result;
    
}
}