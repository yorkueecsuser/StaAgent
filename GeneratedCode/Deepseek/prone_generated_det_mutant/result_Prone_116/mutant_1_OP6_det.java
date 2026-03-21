import java.util.Collections;

class BugExample {
    public void showBug() {
        char a = 'a';
        for  (int bqohrwyh = 0; bqohrwyh < 0; bqohrwyh++) {boolean jpmrkjjd = false;}
        System.out.println(Collections.nCopies(10, a)); // BUG: NCopiesOfChar
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}