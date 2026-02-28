class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input!= null) {
            result = input.toUpperCase();
        }
        
        // Inserting an unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                result = "This will never be reached";
                break;
        }

        return result.length() + " characters"; // BUG: DereferenceWithNullBranch
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        System.out.println(example.showBug("Hello")); // This will work fine
        System.out.println(example.showBug(null));    // This will throw NullPointerException
    }
}