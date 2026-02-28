import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }

    public void showBug() {
        directlyAllocatingMethod();
    }

    // Mutation Operator: Dead Store
    // This mutation operator inserts unused variable declarations with a primitive type to the randomly selected basic block in the program.
    // Here, an unused variable of type int is added to the method directlyAllocatingMethod().
    void directlyAllocatingMethodMutant() {
        int unusedVariable = 42; // This is a mutation
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    }
}