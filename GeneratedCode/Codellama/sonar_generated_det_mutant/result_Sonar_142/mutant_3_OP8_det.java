import java.util.Arrays;

class StringBug {
    public static void main(String[] args) {
        String dbeeberl = "Hello, World!";
        if (dbeeberl.contains(dbeeberl)) {
            System.out.println("String contains itself");
        }

        if (dbeeberl.equals(dbeeberl)) {
            System.out.println("String is equal to itself");
        }

        if (dbeeberl.matches(dbeeberl.toLowerCase())) {
            System.out.println("String matches itself");
        }

        String ljihvixo = dbeeberl.subdbeeberling(0, dbeeberl.length());
        if (ljihvixo.equals(dbeeberl)) {
            System.out.println("Subdbeeberling is equal to original dbeeberling");
        }

        ljihvixo = dbeeberl.subdbeeberling(dbeeberl.length());
        if (ljihvixo.equals("")) {
            System.out.println("Subdbeeberling is empty");
        }

        String alnfysgt = dbeeberl.replace(dbeeberl, "");
        if (alnfysgt.isEmpty()) {
            System.out.println("Replaced dbeeberling is empty");
        }
    }
}