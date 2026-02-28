class FinalizeBug {
    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        /*... */
        return someParameter;
    }

    public int showBug(int param) {
        return this.finalize(param);
    }
}

class DeadStoreMutant {
    // Mutation Operator name: Dead Store
    // Mutation Operator description: Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic book in the program. The name of the variable is a string of eight characters randomly generated in the form of [a-z]. Only one dead store is added in each transformation by this operator.
    // Core Requirements:
    // 1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
    // 2. Generated mutated Java code MUST compile successfully.
    // 3. Mutant code being added MUST be unique not generic.
    // 4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
    // 5. Generated mutated Java code MUST avoid unreachable statement error.

    private int jklm1234; //Dead Store Mutant

    public int showBug(int param) {
        return this.finalize(param);
    }
}