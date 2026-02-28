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

        // MUTATED CODE START
        String s4 = "hello";
        String s5 = "world";
        String s6 = null;

        // BUG: UnusedNullCheckInEquals
        if (s4.equals(s5)) {
            System.out.println("s4 and s5 are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (s5.equals(s6)) {
            System.out.println("s5 and s6 are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (s6.equals(s4)) {
            System.out.println("s6 and s4 are equal");
        }
        // MUTATED CODE END
    }
}