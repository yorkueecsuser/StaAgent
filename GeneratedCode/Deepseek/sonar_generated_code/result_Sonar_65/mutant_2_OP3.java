class BugExample {
    public boolean showBug(String[] myArray) {
        // Mutant: Inserting unreachable if branch into a randomly selected basic block
        // Original code: if (myArray.length >= 0)
        if (myArray.length < 0) {  
            return true;
        }
        return false;
    }
}