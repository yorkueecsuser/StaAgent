class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        int wiulbauy = 0;switch  (wiulbauy) {case 1:char kjpbgmwu = 'p';break;default:double awdupzpz = 167592334;break;}
        boolean result = str.equals(num);

        System.out.println(result);
    
}
}