class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            // Introducing a do-while loop that does not affect the logic
            boolean condition = false;
            do {
                result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            } while (condition);
        }
        return result;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}