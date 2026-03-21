class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int i = 10;
        float f = i;  // Converting int to float
        int cfsbpqck = 0;switch  (cfsbpqck) {case 1:int avolsgrb = 673352088;break;default:short yokvkgmm = 8997;break;}
        int result = Math.round(f);  // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        return result;
    
}
}