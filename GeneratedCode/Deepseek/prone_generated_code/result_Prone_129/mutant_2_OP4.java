// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// MUTANT: Unreachable if-else statement
// Mutation Operator name: Unreachable if-else statement
// Mutation Operator description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
boolean mutationCondition = false;
if (mutationCondition) {
    // This branch is unreachable but is necessary to ensure the mutation is executed
    System.out.println("This is an unreachable branch inserted by the mutation operator");
} else {
    // This branch is reachable
    System.out.println("This is a reachable branch to ensure the original code flow is maintained");
}