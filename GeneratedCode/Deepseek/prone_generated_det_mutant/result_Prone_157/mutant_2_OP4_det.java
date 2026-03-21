import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
if (true && false && false && true && true && false && false && false && false && false && false) {char clxcgzyx = 'w';}else{char uxpgviej = 'c';}

        return s.substring(0);
    
}

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}