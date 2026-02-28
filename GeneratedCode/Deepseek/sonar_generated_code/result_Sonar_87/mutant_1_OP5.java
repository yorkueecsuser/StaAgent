import java.lang.Thread;

class MainClass {
    public void showBug() {
        ClassLoader cl = this.getClass().getClassLoader();  // BUG: JEE applications should not "getClassLoader"
        
        // Mutation: Unreachable Switch Statement
        // Mutation Operator name: Unreachable switch statement
        // Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.
        // 
        // Based on the above mentioned guidelines to avoid unreachable statement errors, this mutant code uses a non-final variable 
        // for the expression of the switch statement to avoid compile-time constants like `false` directly.
        // 
        // The switch statement is unreachable because the condition always evaluates to false.
        // 
        boolean unreachableCondition = false;
        switch (unreachableCondition) {
            case true:
                // Unreachable Code: This code is never reached due to the switch statement being unreachable.
                break;
            default:
                break;
        }
    }

    public static void main(String args[]) {
        MainClass myObject = new MainClass();
        myObject.showBug();
    }
}