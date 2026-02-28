class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        System.out.println(str);
    }
}

// Mutant 1: Duplicate assignment statement
class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        str = str + String.valueOf(10); // Mutant 1: Duplicate assignment statement
        System.out.println(str);
    }
}

// Mutant 2: Duplicate assignment statement
class UselessStringValueOf {
    public static void main(String[] args) {
        String str = "Hello, World!";
        str = str + String.valueOf(10); // BUG: UselessStringValueOf
        str = str + String.valueOf(10); // Mutant 2: Duplicate assignment statement
        System.out.println(str);
    }
}