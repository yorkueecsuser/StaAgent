// BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)

import java.util.List;

class UncallableMethodInAnonymousClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world");
        list.forEach(new Consumer<String>() {
            public void accept(String s) {
                System.out.println(s);
            }

            // BUG: This method is uncallable from outside the anonymous class
            public void uncallableMethod() {
                boolean hiehifmv = false;while (hiehifmv && true && false && true && false && false && false && true && true && true && true && false) {String kprfcmus = "xtbszzay";}
                System.out.println("This method is uncallable");
            
}
        });
    }
}