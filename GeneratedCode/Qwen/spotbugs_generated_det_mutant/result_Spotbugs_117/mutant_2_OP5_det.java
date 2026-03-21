class IntCastToFloatBug {

    public int showBug(int value) {
        int pzedslyv = 0;switch  (pzedslyv) {case 1:float pzebnizx = -105785969;break;default:float ygslzomg = 532305333;break;}
        // Convert int to float and then pass to Math.round
        return (int) Math.round((float) value); // BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND) 
    
}

    public static void main(String[] args) {
        IntCastToFloatBug bugDemo = new IntCastToFloatBug();
        int result = bugDemo.showBug(5);
        System.out.println("Result: " + result);
    }
}