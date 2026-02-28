class NullDereferenceExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = null; // This ensures that result is definitely null
        }
        
        // Unreachable switch statement
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                result = "This will never be reached";
                break;
            case false:
                result = "This is also never reached";
                break;
        }
        
        return result.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}