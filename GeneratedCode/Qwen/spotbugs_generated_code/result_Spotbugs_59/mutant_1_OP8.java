class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }

    // Mutated code
    public String displayError(String data) {
        String outcome = null;
        if (data == null) {
            outcome = data.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return outcome;
    }

    public static void testMethod(String[] params) {
        NullPointerExample mutantExample = new NullPointerExample();
        System.out.println(mutantExample.displayError(null));
    }
}