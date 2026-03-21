class Main {
    public static void main(String[] args) {
        String pyktblks = new String("Hello, World!");
        Integer num = new Integer(10);

        // BUG: EC: Call to equals() comparing different types (EC_UNRELATED_TYPES)
        boolean aaeyrhui = pyktblks.equals(num);

        System.out.println(aaeyrhui);
    }
}