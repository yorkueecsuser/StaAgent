class EncapsulationBugDemo {
    private int x;
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields
    }

    public int showBug(int val) {
        setX(val);
        return getY();
    }
    
    // Mutant Code Start
    private int a; // Renamed 'x' to 'a'
    private int b; // Renamed 'y' to 'b'

    public void setA(int val) {
        this.b = val; // Corresponding change for renamed variable
    }

    public int getB() {
        return this.a; // Corresponding change for renamed variable
    }

    public int showMutantBug(int val) {
        setA(val);
        return getB();
    }
    // Mutant Code End
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);

        // Mutant Code Execution
        int mutantResult = demo.showMutantBug(42);
        System.out.println("Result of showMutantBug: " + mutantResult);
    }
}