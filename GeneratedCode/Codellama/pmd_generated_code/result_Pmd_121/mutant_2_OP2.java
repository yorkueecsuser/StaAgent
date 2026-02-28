class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        str = str + String.valueOf(10); // Duplication 1
        System.out.println(str);
    }
}