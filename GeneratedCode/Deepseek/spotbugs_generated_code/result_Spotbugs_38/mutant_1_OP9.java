class BuggyToString {
    public String tostring() { // This is the original bug
        return "Buggy toString method";
    }

    public String showBug() {
        return tostring();
    }

    // Mutant code: equivalent loop replacement (not applicable in this case)
    // Adding a do-while loop that does not change the functionality of the code
    // Since there are no loops in the original code, I'll add a dummy loop here for demonstration
    public void dummyLoop() {
        int i = 0;
        do {
            System.out.println("Dummy loop iteration: " + i);
            i++;
        } while (i < 5);
    }
}