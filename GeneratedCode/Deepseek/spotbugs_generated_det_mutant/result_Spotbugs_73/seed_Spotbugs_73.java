class Main {
    public static void main(String[] args) {
        String str = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        boolean result = str.equals(num);

        System.out.println(result);
    }
}