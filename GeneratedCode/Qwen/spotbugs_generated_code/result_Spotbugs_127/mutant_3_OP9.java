class IncrementOverwriteBug {

    // Method to demonstrate the bug
    public int showBug(int initialValue) {
        int i = initialValue;
        i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT) 
        return i;
    }

    // Another method to demonstrate the bug with decrement
    public int showBug2(int initialValue) {
        int i = initialValue;
        i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT) 
        return i;
    }

    // Mutant method with equivalent loop replacement (though no loop exists, adding a unique mutant)
    public int mutantMethodWithLoop(int initialValue) {
        int i = initialValue;
        do {
            i = i++; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT) 
            break; // Ensuring the loop runs only once to mimic the original method behavior
        } while (false);
        return i;
    }

    // Another mutant method with equivalent loop replacement for decrement
    public int mutantMethodWithLoop2(int initialValue) {
        int i = initialValue;
        do {
            i = i--; // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT) 
            break; // Ensuring the loop runs only once to mimic the original method behavior
        } while (false);
        return i;
    }

    public static void main(String[] args) {
        IncrementOverwriteBug bugDemo = new IncrementOverwriteBug();
        System.out.println("Result of showBug(5): " + bugDemo.showBug(5)); // Expected output: 5
        System.out.println("Result of showBug2(5): " + bugDemo.showBug2(5)); // Expected output: 5
        System.out.println("Result of mutantMethodWithLoop(5): " + bugDemo.mutantMethodWithLoop(5)); // Expected output: 5
        System.out.println("Result of mutantMethodWithLoop2(5): " + bugDemo.mutantMethodWithLoop2(5)); // Expected output: 5
    }
}