class UnrelatedEquals {

    public boolean showBug() {
        String str = "Hello";
        Comparable<Integer> comp = 123;
        
        // This line demonstrates the bug
        boolean result = str.equals(comp); // BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)

        int unreachableSwitchValue = getUnreachableSwitchValue(); // Dynamic method call
        switch(unreachableSwitchValue) { 
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        return result;
    }

    private int getUnreachableSwitchValue() {
        // This method ensures the condition for the switch is dynamically determined
        return 0; // Default value that does not match any case
    }

    public static void main(String[] args) {
        UnrelatedEquals example = new UnrelatedEquals();
        System.out.println("Result of comparison: " + example.showBug());
    }
}