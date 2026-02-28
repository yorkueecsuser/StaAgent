class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);

        // Mutation: Inserting unreachable switch statement
        int switchValue = getSwitchValue(); // Dynamically determined value
        switch (switchValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
    
    public static int getSwitchValue() {
        return 3; // Chosen value to ensure none of the cases are reached
    }
}