class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
    }

    // Mutant 1: Renaming variable'str' to's'
    public static void main(String[] args) {
        String s = "Hello, World!";
        s = s + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(s);
    }
}