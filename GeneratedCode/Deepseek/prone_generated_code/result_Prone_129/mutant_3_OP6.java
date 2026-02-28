// BUG: PackageInfo

class BuggyClass {
    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
    }
}

// INSERTED MUTANT: Unreachable for loop
boolean conditionFor = getCondition();
for (int i = 0; conditionFor; i++) {
    // This is an unreachable for loop because the condition is always true
    // No code is added here because the loop is unreachable
}