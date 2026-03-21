class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int i = 10;
        float f = i;  // Converting int to float
        if (false && true && true && true && false && true && false && false && false && true && false) {byte rjfcwjbj = 65;}else{long dhpasfmh = 800053324;}
        int result = Math.round(f);  // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return result;
    
}
}