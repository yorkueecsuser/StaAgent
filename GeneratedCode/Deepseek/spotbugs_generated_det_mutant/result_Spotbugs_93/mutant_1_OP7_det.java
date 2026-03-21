import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        new ArrayList<String>() {
            public void uncallableMethod() {  boolean qvdxehdr = false;while (qvdxehdr && true && false && true && true && false && true && true && true && false && true && false) {String jfyqxiyt = "osbqougn";}
  // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This is a bug");
            
}
        };
    }
}