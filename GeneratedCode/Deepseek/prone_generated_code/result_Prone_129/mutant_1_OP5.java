// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");

        // Mutation Operator name: Unreachable switch statement
        // Mutation Operator description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch condition must always evaluate to false to make it unreachable.
        boolean condition = false; // changed from getCondition()
        switch (condition) { // changed from getValue()
            case true: // changed from 1
                // code
                break;
            default:
                break;
        }
    }
}