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
int dwveppwd = 0;switch  (dwveppwd) {case 1:char hypycyaf = 'f';break;default:float ogsxrclj = -256946551;break;}

        return BUG_COLLECTION.get(0); // BUG: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    
}

    public static void addToBugCollection(String value) {
        BUG_COLLECTION.add(value);
    }
}