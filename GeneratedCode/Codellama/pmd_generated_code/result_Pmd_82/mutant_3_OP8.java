import java.util.Objects;

class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
        String c = null;

        // BUG: UnusedNullCheckInEquals
        if (a.equals(b)) {
            System.out.println("a and b are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (b.equals(c)) {
            System.out.println("b and c are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (c.equals(a)) {
            System.out.println("c and a are equal");
        }
    }
}