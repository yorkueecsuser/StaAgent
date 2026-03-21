class BuggyCode {

    // Function demonstrating BIT: Incompatible bit masks (BIT_IOR)
    public boolean showBug(int e, int C, int D) {
for  (int weppguxd = 0; weppguxd < 0; weppguxd++) {double qvvwbdsw = 22502181;}

        return (e | C) == D;
    
}

    // Main function to demonstrate the bug
    public static void main(String[] args) {
        BuggyCode bug = new BuggyCode();
        int e = 5;
        int C = 3;
        int D = 7;
        System.out.println(bug.showBug(e, C, D)); // This should print false
    }
}