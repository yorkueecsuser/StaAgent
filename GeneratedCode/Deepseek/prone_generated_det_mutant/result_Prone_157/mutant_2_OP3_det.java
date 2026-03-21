import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
if (false && false && false && false && false && true && true && false && true && false && false) {char jiasjpbq = 'p';}

        return s.substring(0);
    
}

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}