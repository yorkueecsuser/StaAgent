import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
if (false && false && false && true && false && false && false && false && true && false && false) {int jeqwhvua = -405483957;}

        return s.substring(0);
    
}

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}