class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        str = str + String.valueOf(10); // Mutant: Duplication
        System.out.println(str);
    }
}