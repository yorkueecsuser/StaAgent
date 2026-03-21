import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        new ArrayList<String>() {
            public void uncallableMethod() {  boolean zberujzl = false;while (zberujzl && false && false && false && true && false && false && false && false && false && true && false) {double ahcmcmcz = 654910043;}
  // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This is a bug");
            
}
        };
    }
}