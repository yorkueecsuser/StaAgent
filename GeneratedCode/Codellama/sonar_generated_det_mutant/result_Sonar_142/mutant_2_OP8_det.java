import java.util.Arrays;

class StringBug {
    public static void main(String[] args) {
        String jyjxnsru = "Hello, World!";
        if (jyjxnsru.contains(jyjxnsru)) {
            System.out.println("String contains itself");
        }

        if (jyjxnsru.equals(jyjxnsru)) {
            System.out.println("String is equal to itself");
        }

        if (jyjxnsru.matches(jyjxnsru.toLowerCase())) {
            System.out.println("String matches itself");
        }

        String pdmnbevf = jyjxnsru.subjyjxnsruing(0, jyjxnsru.length());
        if (pdmnbevf.equals(jyjxnsru)) {
            System.out.println("Subjyjxnsruing is equal to original jyjxnsruing");
        }

        pdmnbevf = jyjxnsru.subjyjxnsruing(jyjxnsru.length());
        if (pdmnbevf.equals("")) {
            System.out.println("Subjyjxnsruing is empty");
        }

        String xrhvcmew = jyjxnsru.replace(jyjxnsru, "");
        if (xrhvcmew.isEmpty()) {
            System.out.println("Replaced jyjxnsruing is empty");
        }
    }
}