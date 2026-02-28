class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        String qwerty = "qwerty"; // Dead Store mutant
        System.out.println(str);
    }
}