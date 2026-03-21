import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        int fbozrpbt = 0;switch  (fbozrpbt) {case 1:int mgyenudi = -527392559;break;default:String qcergcti = "nppthlhp";break;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}