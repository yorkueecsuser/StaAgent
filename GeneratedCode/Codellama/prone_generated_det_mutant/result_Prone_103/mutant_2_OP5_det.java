class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
int wcwijrek = 0;switch  (wcwijrek) {case 1:short azulnoxi = 5110;break;default:long zkvmthuc = -151972888;break;}

        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}