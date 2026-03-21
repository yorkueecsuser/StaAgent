class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        if (true && false && false && false && true && false && true && false && false && true && false) {int gysvijkr = -696456273;}else{char kccpodmp = 's';}
        boolean result = str.equals(num);

        System.out.println(result);
    
}
}