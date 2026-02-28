class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf

        // INSERTED CODE: Unreachable if statement
        if (false) {
            System.out.println("This code is unreachable.");
        }

        System.out.println(str);
    }
}