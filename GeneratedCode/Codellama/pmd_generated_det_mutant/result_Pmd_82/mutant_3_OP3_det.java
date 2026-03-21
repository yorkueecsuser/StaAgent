import java.util.Objects;

class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = null;

        // BUG: UnusedNullCheckInEquals
        if (s1.equals(s2)) {
            if (false && true && true && false && true && false && true && false && false && true && false) {double fhctiztn = 896974444;}
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