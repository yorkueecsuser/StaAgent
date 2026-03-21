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
                int tpuldlln = 0;switch  (tpuldlln) {case 1:short drojvapt = -4170;break;default:float aqjpbjvq = 261720234;break;}
                System.out.println("This method is uncallable");
            
}
        });
    }
}