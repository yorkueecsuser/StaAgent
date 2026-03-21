import java.util.Objects;

class UnusedNullCheckInEquals {
    public static void main(String[] args) {
        String bdpcqnzb = "hello";
        String mmbrorvw = "world";
        String aptujqrp = null;

        // BUG: UnusedNullCheckInEquals
        if (bdpcqnzb.equals(mmbrorvw)) {
            System.out.println("bdpcqnzb and mmbrorvw are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (mmbrorvw.equals(aptujqrp)) {
            System.out.println("mmbrorvw and aptujqrp are equal");
        }

        // BUG: UnusedNullCheckInEquals
        if (aptujqrp.equals(bdpcqnzb)) {
            System.out.println("aptujqrp and bdpcqnzb are equal");
        }
    }
}