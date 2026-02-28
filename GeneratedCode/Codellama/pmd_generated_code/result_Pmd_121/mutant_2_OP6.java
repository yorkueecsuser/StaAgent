class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This code should never be reached.");
        }
        System.out.println(str);
    }
}