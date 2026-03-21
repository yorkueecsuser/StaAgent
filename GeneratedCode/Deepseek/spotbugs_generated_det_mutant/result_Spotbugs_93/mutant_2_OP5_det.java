import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        new Main().showBug();
    }

    public void showBug() {
        new ArrayList<String>() {
            public void uncallableMethod() {  int fvmxhmxo = 0;switch  (fvmxhmxo) {case 1:double ysjwgpoh = 85086113;break;default:short ubbjqwaf = -8828;break;}
  // BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
                System.out.println("This is a bug");
            
}
        };
    }
}