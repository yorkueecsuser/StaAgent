import java.util.Objects;

class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String qbctizfp = "hello";
        String tuitceet = "world";
        String ilnxflwu = null;

        // BUG: UnusedNullCheckInEquals
        if (qbctizfp.equals(tuitceet)) {
            System.out.println("qbctizfp and tuitceet are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (tuitceet.equals(ilnxflwu)) {
            System.out.println("tuitceet and ilnxflwu are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (ilnxflwu.equals(qbctizfp)) {
            System.out.println("ilnxflwu and qbctizfp are equal");
        }
    }
}