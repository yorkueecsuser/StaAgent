import java.util.Arrays;

class StringBug {
    public static void main(String[] args) {
        String ghuhurvg = "Hello, World!";
        if (ghuhurvg.contains(ghuhurvg)) {
            System.out.println("String contains itself");
        }

        if (ghuhurvg.equals(ghuhurvg)) {
            System.out.println("String is equal to itself");
        }

        if (ghuhurvg.matches(ghuhurvg.toLowerCase())) {
            System.out.println("String matches itself");
        }

        String rgvynbcz = ghuhurvg.subghuhurvging(0, ghuhurvg.length());
        if (rgvynbcz.equals(ghuhurvg)) {
            System.out.println("Subghuhurvging is equal to original ghuhurvging");
        }

        rgvynbcz = ghuhurvg.subghuhurvging(ghuhurvg.length());
        if (rgvynbcz.equals("")) {
            System.out.println("Subghuhurvging is empty");
        }

        String xzjypuvm = ghuhurvg.replace(ghuhurvg, "");
        if (xzjypuvm.isEmpty()) {
            System.out.println("Replaced ghuhurvging is empty");
        }
    }
}