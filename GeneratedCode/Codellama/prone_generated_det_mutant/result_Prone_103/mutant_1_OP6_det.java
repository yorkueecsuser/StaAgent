class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
for  (int yjaacleu = 0; yjaacleu < 0; yjaacleu++) {float bdfjcivb = -767920869;}

        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}