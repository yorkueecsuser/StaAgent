import java.util.Arrays;

class SubstringBug {

    // BUG: SubstringOfZero
    public String showBug(String s) {
        return s.substring(0);
    }

    // Mutation: Unreachable switch statement
    public String showMutation(String s) {
        boolean shouldMutate = getCondition();
        switch(getUnreachableValue()) {
            case 1:
                if(shouldMutate)
                return s.substring(100); // Mutant Code
            case 2:
                if(shouldMutate)
                return s.substring(1000); // Mutant Code
            default:
                return s.substring(0);
        }
    }
    
    public boolean getCondition() {
        return false;
    }

    public int getUnreachableValue() {
        return 3;
    }

    public static void main(String[] args) {
        SubstringBug bug = new SubstringBug();
        System.out.println(bug.showMutation("Hello"));
    }
}