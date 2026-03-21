class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
for  (int sevlxrfg = 0; sevlxrfg < 0; sevlxrfg++) {long bdkmlbug = 361269428;}

        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}