class FinalizeBugExample {

    // Noncompliant method with the same name as Object.finalize but different signature
    public int finalize(int someParameter) {  // BUG: The signature of "finalize()" should match that of "Object.finalize()"
        return someParameter * 2;
    }

    // Public method to demonstrate the bug
    public int showBug(int value) {
        return finalize(value);  // This calls the incorrect finalize method
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        int result = example.showBug(10);
        System.out.println("Result: " + result);
    }
}