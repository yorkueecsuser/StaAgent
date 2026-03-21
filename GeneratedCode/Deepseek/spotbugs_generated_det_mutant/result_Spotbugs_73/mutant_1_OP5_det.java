class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        int jblnphix = 0;switch  (jblnphix) {case 1:boolean xzqixycw = true;break;default:int pjupnidt = -336337679;break;}
        boolean result = str.equals(num);

        System.out.println(result);
    
}
}