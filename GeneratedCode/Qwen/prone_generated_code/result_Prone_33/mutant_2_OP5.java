class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                result = "Unreachable";
                break;
            case 1:
                // This case is always executed
                break;
        }

        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    private boolean getCondition() {
        // This method always returns false, making the switch case 0 unreachable
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}