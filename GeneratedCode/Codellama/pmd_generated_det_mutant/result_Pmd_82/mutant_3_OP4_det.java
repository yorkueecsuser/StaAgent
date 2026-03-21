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
        if (false && false && false && true && false && true && false && true && true && true && false) {byte jdzzmtcn = -45;}else{float umyixnem = -874650070;}
        }

        // BUG: UnusedNullCheckInEquals
        if (s3.equals(s1)) {
            System.out.println("s3 and s1 are equal");
        }
    
}
}