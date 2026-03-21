class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        int lffkpjsr = 0;switch  (lffkpjsr) {case 1:float ftiqbedy = 645243565;break;default:short zrleoujs = -9728;break;}
        boolean result = str.equals(num);

        System.out.println(result);
    
}
}