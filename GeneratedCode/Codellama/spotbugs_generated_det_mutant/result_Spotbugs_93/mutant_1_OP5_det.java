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
                int fzrhznwn = 0;switch  (fzrhznwn) {case 1:int kjmfudwm = 816616210;break;default:short ramsckrz = -1424;break;}
                System.out.println("This method is uncallable");
            
}
        });
    }
}