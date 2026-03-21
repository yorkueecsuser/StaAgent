import java.util.Objects;

class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String kvvhoeho = "hello";
        String cgsfbjnu = "world";
        String pvddqxvd = null;

        // BUG: UnusedNullCheckInEquals
        if (kvvhoeho.equals(cgsfbjnu)) {
            System.out.println("kvvhoeho and cgsfbjnu are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (cgsfbjnu.equals(pvddqxvd)) {
            System.out.println("cgsfbjnu and pvddqxvd are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (pvddqxvd.equals(kvvhoeho)) {
            System.out.println("pvddqxvd and kvvhoeho are equal");
        }
    }
}