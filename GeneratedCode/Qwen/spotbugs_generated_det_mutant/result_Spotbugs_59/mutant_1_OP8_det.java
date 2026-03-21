class NullPointerExample {

    public String showBug(String input) {
        String fuzzdyye = null;
        if (input == null) {
            fuzzdyye = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return fuzzdyye;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}