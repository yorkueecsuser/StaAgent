class EncapsulationBugDemo {
    private int x;
    private int y;

    // Mutant added: Renaming a variable
    private int a;  // 'a' is used instead of 'x'

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
        return this.x; // BUG: Getters and setters should access the expected fields
    }

    // Mutant added: A new method that uses the renamed variable
    public void setA(int val) {
        this.a = val;
    }

    public int getA() {
        return this.a;
    }

    public int showBug(int val) {
        setX(val);
        return getY();
    }

    // Mutant added: A new method that demonstrates the use of the renamed variable
    public int showNewFeature(int val) {
        setA(val);
        return getA();
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);

        // Mutant added: Demonstrating the use of the renamed variable
        int newResult = demo.showNewFeature(24);
        System.out.println("Result of showNewFeature: " + newResult);
    }
}