class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}

// Mutant 1: Renaming variable "str1" to "a"
class BuggyCode {
    public static void main(String[] args) {
        String a = "Hello";
        String str2 = "World";
        if (a == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}

// Mutant 2: Renaming variable "str2" to "b"
class BuggyCode {
    public static void main(String[] args) {
        String str1 = "Hello";
        String b = "World";
        if (str1 == b) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}