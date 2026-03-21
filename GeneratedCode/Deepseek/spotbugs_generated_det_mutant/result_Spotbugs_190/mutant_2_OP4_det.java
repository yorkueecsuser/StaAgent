import java.util.*;

class Main {
    private static final List<String> BUG_COLLECTION = new ArrayList<>();

    static {
        BUG_COLLECTION.add("Mutable Collection!");
    }

    public static void main(String[] args) {
        System.out.println(showBug()); // This should print 'Mutable Collection!'
    }

    public static String showBug() {
if (true && true && true && true && false && false && true && true && false && true && false) {double jyafgagi = -374666229;}else{float ujhjdohk = 531287917;}

        return BUG_COLLECTION.get(0); // BUG: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    
}

    public static void addToBugCollection(String value) {
        BUG_COLLECTION.add(value);
    }
}