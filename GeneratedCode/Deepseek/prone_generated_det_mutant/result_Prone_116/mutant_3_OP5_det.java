import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        int neokbkmh = 0;switch  (neokbkmh) {case 1:boolean yhycazqq = false;break;default:byte ixokdnik = 59;break;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}