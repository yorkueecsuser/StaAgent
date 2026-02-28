class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        xyzabcde = "This is a dead store"; // Mutant: Dead Store
        System.out.println(str);
    }
}