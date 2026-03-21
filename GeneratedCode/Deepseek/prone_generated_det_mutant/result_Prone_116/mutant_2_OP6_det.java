import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        for  (int yheqfyif = 0; yheqfyif < 0; yheqfyif++) {byte hrhncthe = 83;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}