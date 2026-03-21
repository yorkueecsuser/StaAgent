import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
if (true && true && true && true && false && false && false && true && true && false && false) {float bxaldpvj = 482545594;}

        return s.substring(0);
    
}

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));
    }
}