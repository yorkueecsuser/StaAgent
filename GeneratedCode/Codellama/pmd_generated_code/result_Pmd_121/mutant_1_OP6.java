class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);

        // Mutant code
        for (int i = 0; false; i++) {
            // do nothing
        }
    }
}