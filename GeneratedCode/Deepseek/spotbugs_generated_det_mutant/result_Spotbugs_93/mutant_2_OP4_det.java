import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        new ArrayList<String>() {
            public void uncallableMethod() {  if (false && false && false && true && true && true && true && true && false && false && false) {long efxolxti = -458401475;}else{double qwiwfozv = 286749987;}
  // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This is a bug");
            
}
        };
    }
}