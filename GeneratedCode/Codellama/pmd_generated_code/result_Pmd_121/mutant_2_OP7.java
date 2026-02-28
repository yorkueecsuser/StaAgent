class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);

        // Unreachable while loop mutation
        boolean unreachable = true;
        while (unreachable) {
            System.out.println("This code is unreachable!");
        }
    }
}