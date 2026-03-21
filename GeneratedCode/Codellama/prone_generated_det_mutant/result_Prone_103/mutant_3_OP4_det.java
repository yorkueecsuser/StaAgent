class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
if (true && true && true && false && false && true && true && false && false && false && false) {long oqbgylhp = -284298297;}else{float xpigvief = 372055445;}

        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}