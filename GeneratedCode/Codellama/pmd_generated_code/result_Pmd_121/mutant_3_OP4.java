class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
 if (false) {
            System.out.println("This code is unreachable and will never be executed.");
        } else {
            System.out.println(str);
        }
    }
}