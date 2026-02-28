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
    
    public static void main(String[] args) {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}

class EncapsulationBugDemoMutant1 {
    private int a; // x is renamed to a
    private int y;

    public void setX(int val) {
        this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
        return this.a; // x is renamed to a
    }

    public int showBug(int val) {
        setX(val);
        return getY();
    }
    
    public static void main(String[] args) {
        EncapsulationBugDemoMutant1 demo = new EncapsulationBugDemoMutant1();
        int result = demo.showBug(42);
        System.out.println("Result of showBug: " + result);
    }
}