import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showBug("Hello"));

        // Mutant code
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("Mutant code - unreachable switch statement");
                break;
            default:
                break;
        }
    }

    // Helper method to dynamically generate a value
    static int getValue() {
        return 1;
    }
}