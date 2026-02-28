class DeadParameterBug {
    public int showBug(int inputParameter) {
        inputParameter = 10; // original bug is maintained
        int renamedParameter = inputParameter; // mutant: renamed variable
        return renamedParameter; // mutant: using the renamed variable
    }
}