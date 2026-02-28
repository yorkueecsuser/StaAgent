class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }

        // Introducing an unreachable switch statement as per mutation operator
        int unreachableValue = getUnreachableValue(); 
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never execute");
                break;
            default:
                // This default case is necessary for compilation, but remains unreachable
                break;
        }

        return false;
    }

    private int getUnreachableValue() {
        // This method returns a constant value that never matches any case in the switch
        return 0;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}