// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// BUG: PackageInfo
// Mutation Operator name: Unreachable for loop
// Mutation Operator description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.

boolean conditionFor = false; // new mutation - conditionFor is always false
for (int i = 0; conditionFor; i++) { 
    /* code */ 
}