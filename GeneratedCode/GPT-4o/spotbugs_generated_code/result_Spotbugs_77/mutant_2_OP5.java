class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        return str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)

        // Unreachable switch statement mutant
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999999: // Unlikely value to make switch block unreachable
                System.out.println("This should never print.");
                break;
            default:
                // Default case does nothing to keep it unreachable
                break;
        }
    }

    private int getUnreachableValue() {
        return -1; // Always returns -1, making the switch case unreachable
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}