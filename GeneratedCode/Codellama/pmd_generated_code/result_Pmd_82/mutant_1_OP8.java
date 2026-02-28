import java.util.Objects;

class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = null;

        // BUG: UnusedNullCheckInEquals
        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (s2.equals(s3)) {
            System.out.println("s2 and s3 are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (s3.equals(s1)) {
            System.out.println("s3 and s1 are equal");
        }
    }
}

// Renaming mutant:
class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String a1 = "hello";
        String a2 = "world";
        String a3 = null;

        // BUG: UnusedNullCheckInEquals
        if (a1.equals(a2)) {
            System.out.println("a1 and a2 are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (a2.equals(a3)) {
            System.out.println("a2 and a3 are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (a3.equals(a1)) {
            System.out.println("a3 and a1 are equal");
        }
    }
}