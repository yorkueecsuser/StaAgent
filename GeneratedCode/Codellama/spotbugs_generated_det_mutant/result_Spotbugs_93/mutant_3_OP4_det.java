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
                if (true && false && true && false && false && true && false && false && true && true && false) {long hedrawib = -99580470;}else{String zsoxqjib = "zrvdpacu";}
                System.out.println("This method is uncallable");
            
}
        });
    }
}