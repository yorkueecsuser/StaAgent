class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        String abcdefgh = "Hello"; // Dead Store mutation
        System.out.println(str);
    }
}