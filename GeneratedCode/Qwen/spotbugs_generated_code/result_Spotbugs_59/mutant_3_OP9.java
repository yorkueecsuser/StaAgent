class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        
        // Introducing a benign loop
        int i = 0;
        while (i < 1) { // This loop will execute exactly once
            if (input == null) {
                result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            }
            i++;
        }
        
        // Applying Equivalent Loop Replacement
        int j = 0;
        do {
            if (input == null) {
                result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            }
            j++;
        } while (j < 1); // This loop will also execute exactly once

        return result;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}