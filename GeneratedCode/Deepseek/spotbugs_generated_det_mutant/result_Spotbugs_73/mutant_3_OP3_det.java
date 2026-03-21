class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        if (true && false && true && true && true && true && false && false && true && false && false) {byte lbhnlnsa = -87;}
        boolean result = str.equals(num);

        System.out.println(result);
    
}
}