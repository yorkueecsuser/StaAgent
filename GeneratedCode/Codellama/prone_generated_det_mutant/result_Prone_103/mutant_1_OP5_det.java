class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
int vhkxkaon = 0;switch  (vhkxkaon) {case 1:char cmetgtsh = 't';break;default:byte zjylwkqh = 117;break;}

        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    
}
}