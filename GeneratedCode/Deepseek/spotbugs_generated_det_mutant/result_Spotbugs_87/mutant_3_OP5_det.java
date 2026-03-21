class BuggyCode {

    // Function demonstrating BIT: Incompatible bit masks (BIT_IOR)
    public boolean showBug(int e, int C, int D) {
int zdywrnsf = 0;switch  (zdywrnsf) {case 1:short opgmjahy = -5423;break;default:short bleljgfn = 6050;break;}

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